
import java.util.HashSet;
import java.util.Set;

public class Set_foreach {
    public static void main(String[] args) {
        Set<Person> set= new HashSet<Person>();
        set.add(new Person(14, "varsha"));
        set.add(new Person(15, "sandy"));
        set.add(new Person(16, "sony"));
        set.add(new Person(17, "jp"));

        // for each loop
        for (Person person : set) {
            System.out.println(person.getAge());
            System.out.println(person.getName());
        }
        //foreach()+lambda
        set.forEach((person)->{
            System.out.println(person.getAge());
            System.out.println(person.getName());
        });
        //using stream with foreach()
        set.stream().forEach((person)->{
            System.out.println(person.getAge());
            System.out.println(person.getName());
        });
    }
}
