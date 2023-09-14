import java.util.Date;

public class Date_Time{
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        // System.out.println("Maximum number of Long value  "+Long.MAX_VALUE);
        // System.out.println("The current seconds "+System.currentTimeMillis());
        Date d= new Date();
        // System.out.println("The current date is "+d);
        // Date d1=new Date(07);
        // System.out.println(d1.compareTo(d));
        System.out.println("the milliseconds passed from jan 1, 1970 is "+d.getTime());
        
    }
}