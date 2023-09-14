abstract class Parent{
    public Parent(){
        System.out.println("I am parent class contructor.");
    }
    public void varsha(){
        System.out.println("Hello varsha");
    }
    abstract public void greet();
}
class Child extends Parent{
    public void greet(){
        System.out.println("Hello Everyone.");
    }
}
abstract class Child2 extends Parent {
    public void greet2(){
        System.out.println("Hello Everyone.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Parent p= new Child();
        p.greet();
        
    }
    
}
