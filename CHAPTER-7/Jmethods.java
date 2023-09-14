public class Jmethods{
    static int sum(int x, int y){
        int z;
        if (x>y) {
            z=x+y;
        } else {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args){
        int a=3;
        int b=2;
        int c;
        // How to call the method without creating the object?
        //A.By using the static method ,we can call the method.
        c=sum(a, b);
        // How to call the method with creating the object?
        // By creating the object we can call the method in this way
        // jmethods add= new jmethods();-->object creation
        // add.sum(a,b);-->calling the methods by object creation.
        int a1=5;
        int b1=7;
        int c1;
        c1=sum(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}