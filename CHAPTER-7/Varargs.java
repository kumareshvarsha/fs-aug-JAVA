
public class Varargs {
    static int sum(int x,int ...arr){
        int result=x;
        for (int i : arr) {
            result=result+i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of nothing: "+sum(1));
        System.out.println("The sum of 1 and 2: "+sum(1,2));
        System.out.println("The sum of 3,4 and 5: "+sum(4,5,3));
        System.out.println("The sum of 6,7,8 and 9: "+sum(6,7,8,9));
        System.out.println("The sum of 1,2,3,4 and 5: "+sum(1,2,3,4,5));
        System.out.println("The sum of 5,6,7,8,9 and 10: "+sum(5,6,7,8,9,10));
    }
    
}
