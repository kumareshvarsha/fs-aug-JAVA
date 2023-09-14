

public class VoidReturnType {

    // void return type
    // static void message(){
    //     System.out.println("Do hard work until your Dream come true");
    // }
    // public static void main(String[] args) {
    //     message();        
    //}


    // method using and method calling in array
    static void change(int []arr){
        arr[0]=100;
    }
    public static void main(String[] args) {
        int [] marks={87,92,56,62,82};
        change(marks);//-->It shares the reference ,so we can change the values.
        System.out.println("The value changes in the array is:"+marks[0]);
    }
    
}
