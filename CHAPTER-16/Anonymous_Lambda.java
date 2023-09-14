interface DemoAno{
    void meth1();
}

public class Anonymous_Lambda{
    public static void main(String[] args) {
        // Anonymous class
        // DemoAno de= new DemoAno(){
        //     public void meth1(){
        //         System.out.println("Im meth1");
        //     }
        // };
        // de.meth1();

        // Lambda expression
        DemoAno de=()->{System.out.println("im meth1");};
        de.meth1();

    }
}