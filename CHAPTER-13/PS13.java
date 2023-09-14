class GM extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class We extends Thread{
    public void run(){
        while(true){
             System.out.println("Welcome");
            try {
               Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }
}

public class PS13{
    public static void main(String[] args) {
        GM g= new GM();
        We w= new We();
        g.setPriority(8);
        w.setPriority(9);
        System.out.println(g.getPriority());//-->gets the priority of the thread.
        System.out.println(w.getPriority());
        System.out.println(Thread.currentThread());//-->it gets the reference of the thread
        // g.start();      
        w.start();
        System.out.println(w.getState());//-->it gets the state of the thread
        
    }
}