import java.io.*;
/**
 * IfDemo
 */
public class IfDemo {

    public static void main(String args[]) { 
        System.out.print("Vui long nhap mot ky tu:"); 
        try {
        int ch = System.in.read(); 
        if (ch == 'A') {
        System.out.print("Ban rat may man !");
        }
        else {
        System.out.print("Ban khong gap may !");
        }
        } catch(IOException ie) { 
        System.out.print("Error:"+ie);
        }
        }
        }
        
