import java.util.Comparator;
import java.util.stream.Stream;

public class Count_min_max {
    public static void main(String[] args) {
        // using count(), min() and max()

        Stream<Integer> stream =Stream.of(1,2,3,4,5,6,7);
        System.out.println(stream.count());

        Integer min = Stream.of(1,2,3,4,5,6,7).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min value "+min);

        Integer max = Stream.of(1,2,3,4,5,6,7).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("max value "+max);
    }
}
