import java.io.File;
import java.io.FileWriter;
//import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        // creating a new file
        File myFile = new File("file194");
        try {
            myFile.createNewFile();
        } catch (Exception e) {
            System.out.println("unable to create the file");
            e.getStackTrace();
        }

        // code to write to a file
        try {
            FileWriter fileWriter= new FileWriter("file194");
         fileWriter.write("I love you jesus.I love you mummy,laddu,jp");
         fileWriter.close();
        } catch (Exception e) {
            System.out.println("we cant write anything");
            e.getStackTrace();
        }

        // code to read a file
        // File myFile =new File("file194");
        // try {
        //     Scanner sc= new Scanner(myFile);
        //     while(sc.hasNextLine()){
        //         String line=sc.nextLine();
        //         System.out.println(line);
        //     }
        //     sc.close();
        // } catch (Exception e) {
        //     System.out.println("cant read the file");
        //     e.getStackTrace();
        //}

        // code to delete the file
        // File myFile = new File("file194");
        // if (myFile.delete()) {
        //     System.out.println("deleted");
        // } else {
        //     System.out.println("not deleted");
        // }

        
        
        
    }
}
