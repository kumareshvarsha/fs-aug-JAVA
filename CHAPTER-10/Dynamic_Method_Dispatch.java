class Phone{
    public void on(){
        System.out.println("I am a normal phone");
    }
    public void music(){
        System.out.println("Lets play the music");
    }
}
class SmartPhone extends Phone{
    public void on(){
        System.out.println("I am a Smart phone");
    }
    public void cal(){
        System.out.println("Lets calculate the numbers");
    }
}

public class Dynamic_Method_Dispatch{
    public static void main(String[] args) {
        // Phone p=new Phone();
        // p.on();
        // SmartPhone s= new SmartPhone();
        // s.on();

        Phone obj= new SmartPhone();
        obj.music();
        obj.on();//--> Smartphone class method will execute ,because (phone obj) is reference and (new smartphone) is obejct.Object is creating for the smartphone.soo the overridden method will execute besed on the object.
       // obj.cal();--> It will not execute ,because the reference is parent class and object is created for the sub class ,soo parent class reference does not execute the child class method.
        
    }
}