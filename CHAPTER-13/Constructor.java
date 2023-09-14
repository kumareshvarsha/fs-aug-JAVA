class MyTh extends Thread{
    public MyTh(String name){
        super(name);
    }
    public void run(){
        System.out.println("im varsha");
    }
}
public class Constructor {
    public static void main(String[] args) {
        MyTh t1=new MyTh("sony");
        t1.start();
        System.out.println("the name of the thread is " + t1.getName());
    }
}
