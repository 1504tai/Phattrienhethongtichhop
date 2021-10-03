//dung sysnchronized mà vẫn kh phân luồn được. cô xem sửa giúp em//

import java.io.File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.FutureTask;

public class docfile extends Thread {
    String filename;

    public docfile(String filename){
        this.filename = filename;
    }
    public class doc {
        void doccfile(){
            synchronized(this){
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
        }
    }

    public void run(){
        doc c = new doc();
        c.doccfile();
    }
    

    public static void main(String[] args) {
        docfile t1 = new docfile("D:\\text1.txt");
        t1.start();

        docfile t2 = new docfile("D:\\text2.txt");
        t2.start();
    }
    
}
