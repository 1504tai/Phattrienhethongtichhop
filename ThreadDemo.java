 
 class Table{
     void printtb(int n){
         synchronized(this){
         for (int i=1;i<5;i++){
             System.out.println(n*i);
             try{
                 Thread.sleep(400);
             }catch(Exception e){
                 System.out.println(e);
             }
         }
        }
     }
 }
 class A extends Thread {
    Table t;

    A(Table t){
        this.t = t;
    }

    public void run(){
        t.printtb(5);
    }
}
class B extends Thread{
    Table t;

    B(Table t){
        this.t = t;
    }

    public void run(){
        t.printtb(100);
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        Table obj = new Table();
        A t1 = new A(obj);
        B t2 = new B(obj);
        t1.start();
        t2.start();
    }
    
}