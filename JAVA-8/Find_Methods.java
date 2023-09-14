import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_Methods {
    public static void main(String[] args) {
        // findfist() and findany()
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> element = list.stream().findFirst();
        if (element.isPresent()) {
            System.out.println(element.get());
        } else {
            System.out.println("elemnt is not present");
        }

        Optional<Integer> element2 = list.stream().findAny();
        if (element2.isPresent()) {
            System.out.println(element2.get());
        } else {
            System.out.println("ABSENT");
        }
    }   
}
