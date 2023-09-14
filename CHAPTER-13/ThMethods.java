class MyNewTh1 extends Thread{
    public void run(){
        int i=0;
        while(true){
            System.out.println("THANK YOU  " );
            // i++;
            try {
                Thread.sleep(433);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
class MyNewTh2 extends Thread{
    public void run(){
        while(true){
            System.out.println("welcome " );
        }
    }
}
public class ThMethods {
    public static void main(String[] args) {
        MyNewTh1 t1=new MyNewTh1();
        MyNewTh2 t2=new MyNewTh2();
        t1.start();
        // try {
        //     t1.join();
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
        t2.start();

    }   
}
