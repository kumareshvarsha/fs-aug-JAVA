package varsha;

class c1{
    public int a=1;
    protected int b=2;
    int c=3;
    private int d=4;
    public void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
public class Packages{
    public static void main(String[] args) {
        c1 c=new c1();
        c.meth1();
    }
}