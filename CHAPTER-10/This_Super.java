class One{
    public int a;
    public One(int v){
        this.a=v;
    }
    public int getA(){
        return a;
    }
    public int returnOne(){
        return 1;
    }
}
class Two extends One{
    public Two(int c){
        super(89);
        System.out.println("iam a constructor with value "+c);
    }
}
public class This_Super{
    public static void main(String[] args) {
        // One o= new One(7);// --> First 'this' keyword points to this object.and then
        // System.out.println(o.getA());--> This is parent class object.
        // One n= new One(76);// --> The 'this' keyword points thi object.
        // System.out.println(n.getA());
        Two t= new Two(65);
        System.out.println(t.getA());
    }
}