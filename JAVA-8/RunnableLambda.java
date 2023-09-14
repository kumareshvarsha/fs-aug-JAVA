

public class RunnableLambda {
    public static void main(String[] args) {
        // Runnable runnable =()->{
        //     System.out.println("its runnable ");
        // };
        // Thread th= new Thread(runnable);
        // th.start();

        Thread th= new Thread(()->System.out.println("its thread"));
        th.start();
    }
}
