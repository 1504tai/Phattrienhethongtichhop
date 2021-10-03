import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.FutureTask;

public class FileTReader extends Thread {
    String filename;

    public FileTReader(String filename){
        this.filename = filename;
    }

    public void run(){

        try{
            File f = new File(filename);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null){
                System.out.println(line);
                line = br.readLine();
                Thread.sleep(1000);
            }
            fr.close();
            br.close();
        }catch (Exception ex){
            System.out.println("Lỗi đọc File: "+ ex);
        }
    }

    public static void main(String[] args) {
        FileTReader t1 = new FileTReader("D:\\text1.txt"); 
        t1.start();

        FileTReader t2 = new FileTReader("D:\\text2.txt");
        t2.start();
}
}
