class A{
    public int x;
    public int meth1(){
        return 1;
    }
    public void meth2(){
        System.out.println("The method 2");
    }
}
class B extends A{
    public void meth2(){
        System.out.println("The method 2 of class B");
    }
}
public class Method_Overring {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
        
    }
}
