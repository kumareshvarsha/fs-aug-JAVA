import java.util.Scanner;

public class Handling_Specific_Exception {
    public static void main(String[] args) {
        int [] marks={10,20,30};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array index number");
        int ind=sc.nextInt();
        System.out.println("Enter the value which is going to divide");
        int val=sc.nextInt();
        try {
            System.out.println("The Array index number is " +marks[ind]);
            System.out.println("The result is "+marks[ind]/val);
        } catch (ArithmeticException e) {
            System.out.println("Its arithematic exception");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Its ArrayIndexOutOfBoundsException");
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
