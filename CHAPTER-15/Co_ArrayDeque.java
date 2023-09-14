import java.util.ArrayDeque;

public class Co_ArrayDeque{
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.addFirst(3);
        ad1.addLast(9);
        ad1.offerFirst(7);
        ad1.offerLast(10);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.peekLast());
        System.out.println(ad1.pollFirst());
        System.out.println(ad1.removeLast());
        System.out.println(ad1);
    }
}