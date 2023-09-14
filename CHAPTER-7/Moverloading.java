
public class Moverloading {
    static void get(){
            System.out.println("Good morning varsha");
        }
    static void get(int a){
            System.out.println("Good morning varsha.Your birth date is:"+a);
        }
    static void get(int a, int b){
            System.out.println("Good morning varsha.Your and your's friend birth date is:"+a + " and " + b);
        }
    public static void main(String[] args) {
        get();
        get(4);
        get(4, 14);
        
    }
    
}
