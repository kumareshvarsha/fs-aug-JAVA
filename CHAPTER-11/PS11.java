// Question 1 and 2
// abstract class pen{
//     abstract public void write();
//     abstract public void refill();
// }
// class Book extends pen{
//     public void write(){
//         System.out.println("Im writting");
//     }
//     public void refill(){
//         System.out.println("Im refiiling");
//     }
//     public void Changenib(){
//         System.out.println("changing the nib");
//     }
// }

// question 3
// interface BasicAnimal{
//      void eat();
//      void sleep();
// }
// class Monkey{
//     public void jump(){
//         System.out.println("Monkey is jumping");
//     }
//     public void bite(){
//         System.out.println("Monkey is biting");
//     }
// }
// class Human extends Monkey implements BasicAnimal{
//     public void work(){
//         System.out.println("Human is working");
//     }
//     public void eat(){
//         System.out.println("Animal is eating");
//     }
//     public void sleep(){
//         System.out.println("Animal is sleeping");
//     }
// }

// Question 4
// abstract class Telephone{
//     abstract public void ring();
//     abstract public void lift();
//     abstract public void disconnect();
// }
// class SmartPhone extends Telephone{
//     public void ring(){
//         System.out.println("Ringing......");
//     }
//     public void lift(){
//         System.out.println("Connecting......");
//     }
//     public void disconnect(){
//         System.out.println("busy......");
//     }
// }

// Question 6 and 7
// interface Tvremote{
//     void buttonGreen();
//     void buttonRed();    
// }
// interface SmartTvRemote extends Tvremote{
//     void volumeUp();
//     void volumeDown();
// }
// class Tv implements SmartTvRemote{
//     public void buttonGreen(){
//         System.out.println("Switch on the tv");
//     }
//     public void buttonRed(){
//         System.out.println("Switch off the tv");
//     }
//     public void volumeUp(){
//         System.out.println("raise the volume");
//     }
//     public void volumeDown(){
//         System.out.println("down th volume");
//     }
// }
public class PS11 {
    public static void main(String[] args) {
        // Question 1 and 2
        // Book b= new Book();
        // b.write(); 
        // b.Changenib();  
        
        // Question 3
        // Human h= new Human();
        // h.sleep();
        // h.eat();
        // h.jump();
        
        // Question 5
        // Monkey m= new Human();
        // m.bite();
        // m.jump();

        // Question 4
        // Telephone t= new SmartPhone();
        // t.ring();
        // t.lift();
        // t.disconnect();

        // Question 6 and 7
        // Tv t= new Tv();
        // t.buttonGreen();
        // t.buttonRed();
        // t.volumeDown();
        // t.volumeUp();
    }
}