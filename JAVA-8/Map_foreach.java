import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class Map_foreach {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<Integer, Person>();

        map.put(1,new Person(23, "jp"));
        map.put(2,new Person(26, "sandy"));
        map.put(3,new Person(28, "varsha"));

        // foreach loop
        for(java.util.Map.Entry<Integer, Person> entry: map.entrySet())   {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getName());
        }

        // foreach()+lambda
        map.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v.getName());
        });
    }
}
