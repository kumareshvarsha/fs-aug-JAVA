class Runnable1 implements Runnable{
    public void run(){
        int i=0;
      while(i<=4000){
        System.out.println("I am a thread1 Class method");
        System.out.println("i am varsha ");
        i++;
      }
    }
}
class Runnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<=4000){
        System.out.println("I am a thread2 Class method");
        System.out.println("i am jayaprasad ");
        i++;
        }
    }
}
public class MyRunnable {
    public static void main(String[] args) {
        Runnable1 r1=new Runnable1();
        Thread t1=new Thread(r1);

        Runnable2 r2=new Runnable2();
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
        
    }
}
