// creating the private access modifiers.To access the private modifiers we should use public setters and getters method.
// Example 1
// class Employee{
    // private int id;
    // private String name;
    // public void setName(String n){
    //     name=n;
    // }
    // public String getName(){
    //     return name;
    // }
    // public void setId(int n){
    //         id=n;
    // }
    // public int getId(){
    //     return id;
    // }
//}
// Example 2
// class Circle{
//         private float radius;
//         public void setradius(int n){
//             radius=n;
//         }
//         public float getArea(){
//             return (3.14f*radius*radius);
//         }
//         public float getPerimeter(){
//             return (2*3.14f*radius);
//         }
        
// }
public class AccessModifiers{
    public static void main(String[] args) {
        // Example 1
        // Employee em= new Employee();
        // em.setName("Kumaresh Varsha");
        // System.out.println(em.getName());
        // em.setId(101);
        // System.out.println(em.getId());

        // Example 2
        // Circle cr= new Circle();
        // cr.setradius(4);
        // System.out.println("The area of a circle "+cr.getArea());
        // System.out.println("The perimeter of a circle "+cr.getPerimeter());
    }
}