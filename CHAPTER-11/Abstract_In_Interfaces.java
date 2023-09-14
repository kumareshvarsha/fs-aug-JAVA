interface Bicycle{
    int a=194;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface Music{
    void listen();
    void stop();
}
class SuperCycle implements Bicycle, Music{
    public void horn(){
        System.out.println("peee peeee peee peee");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying the break.");
    }
    public void speedUp(int increment){
        System.out.println("Applying the speed");
    }
    public void listen(){
        System.out.println("Listening the music");
    }
    public void stop(){
        System.out.println("Music was stopped");
    }
}
public class Abstract_In_Interfaces {
    public static void main(String[] args) {
        SuperCycle sc= new SuperCycle();
        sc.applyBreak(8);
        System.out.println(sc.a);
        sc.speedUp(8);
        sc.listen();
        sc.stop();
    }   

}