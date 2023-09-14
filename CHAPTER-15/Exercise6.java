class InvalidInputException extends Exception{
    public String toString(){
        return "Cannot use 8 and 9";
    }
}
class CannotDividedByZero extends Exception{
    public String toString(){
        return "Cannot Divided by zero";
    }
}
class MaxInputException extends Exception{
    public String toString(){
        return "Cannot be Greater than 100000";
    }
}
class MaxMultiplyInput extends Exception{
    public String toString(){
        return "Cannot be Greater than 7000";
    }
}
class CustomCalculator{
    public double add(double a, double b)throws InvalidInputException,MaxInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        if (a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a+b;
    }
    public double substract(double a, double b)throws InvalidInputException,MaxInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        if (a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a-b;
    }
    public double multiply(double a, double b)throws InvalidInputException,MaxInputException,MaxMultiplyInput{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }        
        if (a>100000 || b>100000) {
            throw new MaxInputException();
        }else if(a>7000 || b>7000){
            throw new MaxMultiplyInput();
        }
        return a*b;
    }
    public double divide(double a, double b)throws InvalidInputException,CannotDividedByZero,MaxInputException{
        if(a==8 || b==9){
            throw new InvalidInputException();
        }
        if (b==0) {
            throw new CannotDividedByZero();
        }
        if (a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a/b;
    }

}

public class Exercise6 {
    public static void main(String[] args) throws InvalidInputException,CannotDividedByZero, MaxInputException, MaxMultiplyInput{
        CustomCalculator c=new CustomCalculator();
        //c.add(7,9);
        //c.divide(7, 0);
        //c.multiply(7001, 887);
        c.substract(57875757, 738248377);

    }
}
