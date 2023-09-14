// question 1

import java.io.FileWriter;

class MyDeprecated{
   // @SuppressWarnings
    @Deprecated
    void meth1(){
        System.out.println("its deprecated");
    }
}
interface hjg{
    void display();
}
public class PS16 {
    public static void main(String[] args) {
        
        // MyDeprecated d=new MyDeprecated();
        // d.meth1();

        // hjg h=new hjg() {
        //     @Override
        //     public void display(){
        //         System.out.println("hi");
        //     }
        // };
        // h.display();

        int i=10;
        String table ="";
        for(int j=0;j<=10;j++){
            table += i+ "X"+(j+i)+"="+i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter= new FileWriter("multiplication");
         fileWriter.write(table);
         fileWriter.close();
        } catch (Exception e) {
            System.out.println("we cant write anything");
            e.getStackTrace();
        }
    }
}
