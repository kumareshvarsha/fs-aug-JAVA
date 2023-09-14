import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting_Exmple {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        List<String> sortedList=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);
        List<String> sortedList2 = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList2);

        // decending order
        List<String> sortedList3=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList3);
        List<String> sortedList4 = fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList4);

    }
}
