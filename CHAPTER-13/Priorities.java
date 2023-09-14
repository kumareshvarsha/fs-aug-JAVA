class MyTh1 extends Thread{
    public MyTh1(String name){
        super(name);
    }
    public void run(){
        while(true){
            System.out.println("THANK YOU  "+ this.getName() );
        }
        
    }
}
public class Priorities {
    public static void main(String[] args) {
        MyTh1 t1=new MyTh1("varsha1");
        MyTh1 t2=new MyTh1("varsha2");
        MyTh1 t3=new MyTh1("varsha3");
        MyTh1 t4=new MyTh1("varsha4");
        MyTh1 t5=new MyTh1("varsha5(most important thread)");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


    }
}
