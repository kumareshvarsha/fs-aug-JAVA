import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class PS15 {
    public static void main(String[] args) {
        // Question number 1
        // ArrayList<String> ar= new ArrayList<>();
        // ar.add("Student 1");
        // ar.add("Student 2");
        // ar.add("Student 3");
        // ar.add("Student 4");
        // ar.add("Student 5");
        // ar.add("Student 6");
        // ar.add("Student 7");
        // ar.add("Student 8");
        // ar.add("Student 9");
        // ar.add("Student 10");
        // System.out.println(ar);
        // for (String student : ar) {
        //     System.out.println(student);
        // }

        // question number 2
        // LocalDateTime d=LocalDateTime.now();
        // DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        // String tf= d.format(df);
        // System.out.println(tf);

        // question number 3
        // HashSet<Integer> hs= new HashSet<>();
        // hs.add(4);
        // hs.add(5);
        // hs.add(6);
        // hs.add(7);
        // hs.add(8);
        // hs.add(5);
        // System.out.println(hs);

        // question number 4---- the ,e
        // Date d= new Date();
        // System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

        // question number 5
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    }
}
