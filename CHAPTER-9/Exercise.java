import java.util.Scanner;
import java.util.Random;
class Game{
    public int noOfGuesses=0;
    public int myNumber;
    public int compNumber;
    public int getnoOfGuesses(){
        return noOfGuesses;
    } 
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    Game(){
        Random rn=new Random();
        this.compNumber=rn.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        myNumber=sc.nextInt();
    } 
        
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(myNumber==compNumber){
            System.out.format("Yes you guessed it right,it was %d  and you guessed it in %d attempts",compNumber,noOfGuesses);
            return true;
        }
        else if(myNumber<compNumber){
            System.out.println("Too low..");
        }
        else if(myNumber>compNumber){
            System.out.println("Too hign..");
        }
     return false;
    }
}

public class Exercise {
    public static void main(String[] args) {
        Game g =new Game();
        boolean b=false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
    }
}
