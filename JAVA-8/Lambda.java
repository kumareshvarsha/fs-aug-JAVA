package LAMBDA_EXPRESIONS;

interface shape{
    void draw();
}
// class Rectangle{
//     void draw(){
//         System.out.println("Its a method of rectangle");
//     }
// }
// class Square{
//     void draw(){
//         System.out.println("Its a method of square");
//     }
// }
// class Circle{
//     void draw(){
//         System.out.println("Its a method of circle");
//     }
// }



public class Lambda{
    public static void main(String[] args) {
        // Normal lambda syntax
        shape Rectangle = ()->System.out.println("Its a lambda expression");
        //Rectangle.draw();
        shape Square =()->System.out.println("Its a square draw method");
        //Square.draw();
        shape Circle =()->System.out.println("Its a circle draw method");
        //Circle.draw();
        
        print(Rectangle);
        print(Square);
        print(Circle);
    }
    // Parameteraized method
    public static void print(shape shape){
        shape.draw();
    }
    

    
    
}