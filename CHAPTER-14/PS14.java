// import java.util.Scanner;
class MyException extends Exception{
    public String toString(){
        return " maximum no of trails reached,try again after 1min";
    }
}

public class PS14 {
    // problem 5
    // public static void prob(int i)throws MyException{
    //     if (i>=5){
    //        // System.out.println("error");
    //        try {
    //         throw new MyException();
    //        } catch (Exception e) {
    //         System.out.println(e);
    //        }
    //     }
    // }
    public static void main(String[] args) {
        // problem 1
        //syntax error
        // int a=7
        // logigal error
        // int age=78;
        // int year_born=2000-78;
        // Exception error
        // System.out.println(4/0);

        // problem 2
        // try {
        //     int a=8;
        //     int b=0;
        //     int c=a/b;
        //     System.out.println(c);
        // } catch (ArithmeticException e) {
        //    System.out.println("HaHaHa");
        // }catch( IllegalArgumentException e){
        //     System.out.println("HeHeHe");
        // }

        // problem 3
        // boolean flag =true;
        // int [] marks={10,20,30};
        // Scanner sc=new Scanner(System.in);
        // int index;
        // int i=0;
        // while(flag && i<5 ){
        //     try {
        //         System.out.println("enter the index of the array is  ");
        //         index =sc.nextInt();
        //         System.out.println("the valuse of the index numbe is "+marks[index]);
        //         break;
        //     } catch (Exception e) {
        //         System.out.println("invalid index");
        //         i++;
        //     }            
        // }
        //if (i>=5){
        // System.out.println("error");
        //}
        // problem 4
        // if (i>=5){
        //    // System.out.println("error");
        //    try {
        //     throw new MyException();
        //    } catch (Exception e) {
        //     System.out.println(e);
        //    }
        // }
        
    }
}
