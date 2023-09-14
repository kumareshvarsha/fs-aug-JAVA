import java.util.ArrayList;
import java.util.List;

public class foreach_Method {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<Person>();
        list.add(new Person(14, "varsha"));
        list.add(new Person(15, "sandy"));
        list.add(new Person(16, "sony"));
        list.add(new Person(17, "jp"));
        // without using java-8
        for (Person person : list) {
            System.out.println(person.getAge());
            System.out.println(person.getName());   
        }
        //using java-8
        list.forEach((person)->{
            System.out.println(person.getAge());
            System.out.println(person.getName());
        });
        //using stream
        list.stream().forEach((person)->{
            System.out.println(person.getAge());
            System.out.println(person.getName());
        });
    }
}

class Person{
    private String name;
    private int age;

    public Person(int age, String name){
        super();
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
