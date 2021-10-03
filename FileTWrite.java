import java.io.FileWriter;

import java.io.BufferedWriter;

import java.io.File;

public class FileTWrite implements Runnable {
    String fileName;
    public String getFileName(){
        return fileName;
    }

    public FileTWrite (String fileName){
        this.fileName = fileName;
    }
    
     public void run() {
        try {
            FileWriter fw = new FileWriter(new File(this.getFileName()));
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0 ; i < 10; i++){
                int rand = (int) (Math.random() * 10);
                bw.write(rand + "\t");
            }
            bw.close();
            fw.close();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new FileTWrite("D:\\test1.txt"));
        Thread t2 = new Thread(new FileTWrite("D:\\test2.txt"));
        Thread t3 = new Thread(new FileTWrite("D:\\test3.txt"));
    
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("Done!");
}
}