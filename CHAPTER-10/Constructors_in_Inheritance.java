class Base1{
    public int x;
    Base1(){
        System.out.println("I am a constructor.");
    }
    Base1(int a){
        System.out.println("I am a constructor in base class with value a " +a);
    }
}
class Derived1 extends Base1{
    public int y;
    Derived1(){
        //super(8);// --->It will execute the parametered constructor from the base class
        System.out.println("Iam derived class constructor.");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("I am a constructor in derived with value b "+b );
    }
}
class Child_of_derived extends Derived1{
    public int z;
    Child_of_derived(){
        System.out.println("I am child class constructor");
    }
    Child_of_derived(int a, int b, int c){
        super(a,b);
        System.out.println("I am a constructor in Childofderivied class with value c "+c);

    }
}

public class Constructors_in_Inheritance{
    public static void main(String[] args) {
        // Base1 b= new Base1();-->It execute only without parameter contructor.
        //Derived1 d= new Derived1(2,3);-->The execution start from two parameters constructor.
        //Child_of_derived c= new Child_of_derived(4,5 , 6);-->The execution start from three parameters constructor.
        
    }
}