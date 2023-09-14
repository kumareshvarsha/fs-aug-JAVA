import java.util.function.Consumer;
import java.util.function.Function;

public class Functional_Interface {
    public static void main(String[] args) {
        // we writting the implementation for the predefined interface like function<t,r> 
       Function<String,Integer> function = (String s)->{
        return s.length();
       };
       System.out.println(function.apply("varsha"));

       Consumer<String > consumer =(String n)->System.out.println(n);
       consumer.accept("varsha");
    }
}
