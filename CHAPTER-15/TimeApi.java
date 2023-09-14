import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeApi{
    public static void main(String[] args) {
        LocalDate ld =LocalDate.now();
        System.out.println(ld);

        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        // LocalTime t1= lt.minusMinutes(5);
        // System.out.println("After substracting 5 minutes "+t1);LocalTime t1= lt.minusMinutes(5);
        LocalTime t1= lt.plusMinutes(5);
        System.out.println("After adding 5 minutes "+t1);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);
    }
}       
