import java.util.Scanner;
import java.lang.Math;
import jdk.javadoc.internal.doclets.formats.html.resources.standard_ja;

public class toado {
    float x;
    float y;

    void Toado(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    void nhaptoado()
    {
        Scanner sc = new Scanner(System.in);
        float a,b;
        System.out.println("Hãy nhập tạo độ x: ");
        a = sc.nextFloat();
        System.out.println("Hãy nhập tạo độ y: ");
        b = sc.nextFloat();

        Toado(a,b);
    }

    void intoado()
    {
        System.out.println("Tạo độ (x,y) = " + "(" + x + " " + y + ")");

    }

    void khoangcanh()
    {   
        
        double s = Math.sqrt(x*x + y*y);
    
        System.out.println("KHoảng cách đến điểm O = " + s + ".");
    }

    public static void main(String[] args) {
        toado A = new toado();
        A.nhaptoado();
        System.out.println("Tọa độ điểm A là:");
        A.intoado();

        toado B = new toado();
        B.Toado(0, 0);
        System.out.println("Tọa độ điểm B là:");
        B.intoado();

        A.khoangcanh();
    }
}
