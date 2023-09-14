class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius should not be negetive";
    }
    public String getMessage(){
        return "Radius should not be negetive";
    }
}

public class Throw_Throws{
    public static double Area(int r) throws NegativeRadiusException{
        if (r<0) {
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static void main(String[] args) {
        try {
            double ar = Area(-8);
            System.out.println("The area of a circle is " +ar);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}