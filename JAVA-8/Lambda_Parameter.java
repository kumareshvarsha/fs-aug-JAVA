interface addable{
    int add(int a, int b);
}

public class Lambda_Parameter {
    public static void main(String[] args) {
        // for single return statement
        // addable addition=(int a,int b)-> a+b;
        // addition.add(65, 74);
        // System.out.println(addition.add(65, 74));

        //for multiple return statement
        addable abc =(int a, int b)->{
            int c=a+b;
            return c;
        };
        System.out.println(abc.add(78, 98));

    }
}
