import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Create_Stream {
    public static void main(String[] args) {
        // create a stream
        // Stream<String> stream = Stream.of("varsha","sony","jp");
        // stream.forEach(System.out::println);

        //create a stream from source
        // Collection<String> collection = Arrays.asList("html","css","javascript","java");
        // Stream<String> stream2 = collection.stream();
        // stream2.forEach(System.out::println);

        // List<Integer> list =Arrays.asList(1,2,3,4,5);
        // Stream<Integer> stream3 =list.stream();
        // stream3.forEach(System.out::println);

        String[] strArray = {"a","b","c"};
        Stream<String> stream4 = Arrays.stream(strArray);
        stream4.forEach(System.out::println);        
    }
}
