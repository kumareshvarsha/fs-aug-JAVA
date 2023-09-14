import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Gregorian{
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE));
        GregorianCalendar g= new GregorianCalendar();
        System.out.println(g.isLeapYear(2017));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println("The hashcode of the calendar "+c.hashCode());
    }
}

