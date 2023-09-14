class Thread1 extends Thread{
    public void run(){
        int i=0;
      while(i<=4000){
        System.out.println("I am a thread1 Class method");
        System.out.println("i am varsha ");
        i++;
      }
    }
}
class Thread2 extends Thread{
    public void run(){
        int i=0;
        while(i<=4000){
        System.out.println("I am a thread2 Class method");
        System.out.println("i am jayaprasad ");
        i++;
        }
    }
}

public class MyThread{
    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
        
    }
}