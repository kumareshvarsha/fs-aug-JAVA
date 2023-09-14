import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DT_Formatter {
    public static void main(String[] args) {
        LocalDateTime dt =LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
        DateTimeFormatter df2=DateTimeFormatter.ISO_DATE_TIME;
        //String dtf= dt.format(df);
        String dtf= dt.format(df2);
        System.out.println(dtf);
    }
}
