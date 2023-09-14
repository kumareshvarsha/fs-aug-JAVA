package cal;
class Calculator{
    public void calculate(int a, int b){
        System.out.println("the result is" + a +b);
    }
}
class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("the result is" + Math.sin(a +b));
    }
}
class HyCalculator{
    public void calculate(int a, int b){
        System.out.println("the result is" + a +b);
        System.out.println("the result is" + Math.sin(a +b));
    }
}
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("i am a main method");
    }
}
