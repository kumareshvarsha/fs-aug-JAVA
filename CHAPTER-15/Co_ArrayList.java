import java.util.*;

public class Co_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(11);
        l2.add(13);
        l2.add(43);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(9);
        l1.add(6);
        l1.add(7);
        l1.add(6, 1);
        l1.remove(2);
        System.out.println(l1);
        System.out.println(l1.contains(9));
        l1.addAll(l2);
        System.out.println(l1);
        l1.addAll(0,l2);
        System.out.println(l1);
        System.out.println(l1.indexOf(9));
        System.out.println(l1.lastIndexOf(13));
    }
}