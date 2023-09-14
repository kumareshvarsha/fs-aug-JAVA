import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int [] marks={10,20,30};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array index number ");
        int ind=sc.nextInt();
        
        try {
            System.out.println("this nested try catch");
            try {
                System.out.println("the value of the array index number is "+ marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("this index is not here");
                System.out.println("this is level 2");
            }
            
        } catch (Exception e) {
            System.out.println("this is level 1");
        }
        
    }
}
