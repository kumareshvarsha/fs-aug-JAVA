package com.codewithharry.shape;

class Rectangle{
    int Length;
    int Width;
    public void setLength(int l){
        this.Length=l;
    }
    public int getLength(){
        return Length;
    }
    public void setWidth(int w){
        this.Width=w;
    }
    public int getWidth(){
        return Width;
    }
    public int Perimeter(){
        return 2*(Length+Width);
    }
    public int Area(){
        return Length*Width;
    }
}
class Square extends Rectangle{
    int Side;
    public void setSide(int s){
        this.Side=s;
    }
    public int getSide(){
        return Side;
    }
     public int Perimeter2(){
        return 4*Side;
    }
    public int Area2(){
        return Side*Side;
    }   
}
class Circle extends Square{
    int Radius;
    public void setRadius(int r){
        this.Radius=r;
    }
    public int getRadius(){
        return Radius;
    }
    public float Area3(){
        return (3.14f*Radius*Radius);
    }
}
class Cylinder extends Circle{
    int Radius2;
    int Height;
    public void setRadius2(int r){
        this.Radius2=r;
    }
    public int getRadius2(){
        return Radius2 ;
    }
    public void setHeigh(int h){
        this.Height=h;
    }
    public int getHeight(){
        return Height;
    }
    public float Volume(){
        return 2*3.14f*Radius2*Height;
    }
}
public class Exercise{
    public static void main(String[] args) {
        Cylinder c= new Cylinder();
        c.setLength(8);
        System.out.println("The length of a rectangle :"+c.getLength());
        c.setWidth(4);
        System.out.println("The Width of a rectangle :"+c.getWidth());
        System.out.println("The perimeter of a rectangle :"+c.Perimeter());
        System.out.println("The area of a rectangle :"+c.Area());
        c.setSide(3);
        System.out.println("The side of a square :"+c.getSide());
        System.out.println("The perimeter of a square :"+c.Perimeter2());
        System.out.println("The area of a sqaure :"+c.Area2());
        c.setRadius(7);
        System.out.println("The radius of a circle :"+c.getRadius());
        System.out.println("The area of a circle :"+c.Area3());
        c.setRadius2(6);
        System.out.println("The radius of a cylinder :"+c.getRadius2());
        c.setHeigh(4);
        System.out.println("The height of a cylinder :"+c.getHeight());
        System.out.println("The volume of a cylinder :"+c.Volume());
        
    }
}