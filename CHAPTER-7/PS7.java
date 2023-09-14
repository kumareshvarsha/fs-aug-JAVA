

public class PS7 {

    // question 1 
    // static void multiplication(int n){
    //     for(int i=1;i<=10;i++){
    //        System.out.format("%d * %d = "+n*i,n,i);
    //        System.out.println("");
    //     }
    // }
    // public static void, main(String[] args) {
    //     multiplication(5);
    // }
    
    
    // question 2
    // static void pattern(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern(4);        
    // }


    // question 3
    // static int sumrec(int n){
    //     if (n==1) {
    //         return 1;
    //     } else {
    //         return n + sumrec(n-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     int c= sumrec(10);
    //     System.out.println(c);        
    // }


    // question 4
    // static void pattern2(int n){
    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern2(4);        
    // }


    // question 5
    // static int fib(int n){
    //     if (n==1 || n==2) {
    //         return n-1;
    //     } else {
    //         return fib(n-1)+fib(n-2);
    //     }
    // }
    // public static void main(String[] args) {
    //     // fibanocci series 0,1,1,2,3,5,8,13,21,34,55 
    //     int result = fib(5);
    //     System.out.println(result);        
    // }


    // question 6
    // static int average(int ...arr){
    //     int sum=0;
    //     for (int a : arr) {
    //         sum += a;
    //     }   
    //     return (sum/arr.length);         
    // }
    // public static void main(String[] args) {
    //     System.out.println("The average of 10 and 20 is: " + average(10,20));
    //     System.out.println(average(18,46,26));
    // }


    // question 7
    // static void pattern3_rec(int n){
    //     if (n>0) {
    //         for(int i=n;i>0;i--){
    //             System.out.print("*");
    //         }
    //         System.out.println("");
    //         pattern3_rec(n-1);
    //     }
    // }
    // public static void main(String[] args) {
    //     pattern3_rec(4);
    // }


    // question 8
    // static void pattern4_rec(int n){
    //         if (n>0) {
    //             pattern4_rec(n-1);
    //             for(int i=0;i<n;i++){
    //                 System.out.print("*");
    //             }
    //             System.out.println("");
    //         }
    // }
    // public static void main(String[] args) {
    //     pattern4_rec(4);        
    // }


    // question 9
    // static float cel_to_fah(float cel){
    //     float result=(cel*9/5)+32;
    //     return result;
    // }
    // public static void main(String[] args) {
    //     System.out.println("Converting celsius degree to fahrenheit is "+cel_to_fah(21)+"F");
    // }


    // question 10
    static int sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum +=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("The sum of n natural numbers: "+sum(18));
    }
}
