public class Finally {
    public static int prob(){
        try {
            int a=40;
            int b=2;
            int c=a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("No matter what is going on ,i am going to execute");
        }
        return 0;
    }
    public static void main(String[] args) {
        // int p=prob();
        // System.out.println(p);
        // int a=4;
        // int b=2;
        // while(true){
        //     try {
        //         System.out.println(a/b);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //         break;
        //     }
        //     finally{
        //         System.out.println("finnaly for the value of b is "+b);
        //     }
        //     b--;
        // }
        try{
            System.out.println(50/0);
        }
        finally{
            System.out.println("finally");
        }
        
    }
}
