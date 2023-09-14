interface Vehicle{
    void sound();
    void Break();
    default void songs(){
        System.out.println("playing songs");
    }
    // static method example
    static String getCompany(){
        return "BMW";
    }
}
class sony implements Vehicle{
    public void sound(){
        System.out.println("sound is playing");
    }
    public void Break(){
        System.out.println("Break is applying");
    }
}


public class Default_Method{
    public static void main(String[] args) {
        Vehicle s=new sony(); 
      s.songs();
      s.sound();
      s.Break();
      System.out.println(Vehicle.getCompany());
      
    }
}