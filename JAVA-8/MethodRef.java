import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable{
    void print(String msg);
}

public class MethodRef{
    public void display(String msg){
        msg=msg.toUpperCase();
        System.out.println(msg);
    }

    public static int addition(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        
        //1.Method reference to a static method
        // using lambda expressions
        // Function<Integer, Double> function = (input)->
        //     Math.sqrt(input);
        // System.out.println(function.apply(4));
        //using method reference
        // Function<Integer, Double> function2= Math::sqrt;
        // System.out.println(function2.apply(4));

        //using lambda expressions
        // BiFunction<Integer,Integer,Integer> biFunction = (a,b)-> MethodRef.addition(a,b);
        // System.out.println(biFunction.apply(4,5));
        //using method reference
        // BiFunction<Integer,Integer,Integer> function3 = MethodRef::addition;
        // System.out.println(function3.apply(5, 8));

        //2.Method reference to an instance method of an object 
        //MethodRef mr=new MethodRef();
        //using lambda expressions
        // Printable printable = (msg)-> mr.display(msg);
        // printable.print("varsha");
        //using method reference
        // Printable printable = mr::display;
        // printable.print("varsha");

        //3.reference to the instance method 
        // sometimes we call a method of an arguement in the lambda expressions.In that case , we can use a method reference to call an instance method of an arbitary object of a specific type.
        //using lambda expression
        // Function<String , String> stringFunction = (String input) -> input.toLowerCase();
        // System.out.println(stringFunction.apply("SONY"));
        //using method reference
        // Function<String ,String> sf = String::toLowerCase;
        // System.out.println(sf.apply("JP"));

        //4.reference to a constructor
        List<String> fruits =new ArrayList<>();
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("watermelon");

        // using lambda expression
        // Function<List<String>, Set<String>> setFunction = (fruitsList) -> new HashSet<>(fruitsList);
        //System.out.println(setFunction.apply(fruits));
        // using method reference
        Function<List<String>, Set<String>> setFunction2 = HashSet:: new;
        System.out.println(setFunction2.apply(fruits));
    }
}