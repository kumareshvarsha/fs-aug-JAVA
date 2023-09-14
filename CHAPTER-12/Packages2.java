package varsha;
class c2{
    public int a=1;
    protected int b=2;
    int c=3;
    private int d=4;
}
public class Packages2 {
    public static void main(String[] args) {
        c2 c=new c2();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        // System.out.println(c.d);
    }
    
}
