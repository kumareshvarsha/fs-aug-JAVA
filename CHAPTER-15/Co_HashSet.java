import java.util.HashSet;

public class Co_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> myHash= new HashSet<>(6, 0.5f);
        myHash.add(5);
        myHash.add(4);
        myHash.add(3);
        myHash.add(2);
        myHash.add(2);
        System.out.println(myHash);
        myHash.remove(3);
        System.out.println(myHash);
        System.out.println(myHash.isEmpty());
        HashSet<Integer> myHash2=new HashSet<>(8, 0.6f);
        System.out.println(myHash2.isEmpty());
        System.out.println(myHash.size());
        myHash.clear();
        System.out.println(myHash);
    }
}
