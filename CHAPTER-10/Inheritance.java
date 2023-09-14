class Base{
    int x;
    public void setX(int n){
        System.out.println("Im in base class and setting x now.");
        x=n;
    }
    public int getX(){
        return x;
    }
}
class Derived extends Base{
    int y;
    public void setY(int m){
        System.out.println("Im in base class and setting y now.");
        y=m;
    }
    public int getY(){
        return y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        // craeting an object for base class
        Base b= new Base();
        b.setX(7);
        System.out.println(b.getX());
        
        // creating an object for derived class
        Derived d= new Derived() ;
        d.setY(4);
        System.out.println(d.getY());
    }

    
}