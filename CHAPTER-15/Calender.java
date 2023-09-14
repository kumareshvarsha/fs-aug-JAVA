import java.util.*;
public class Calender {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println("The current year"+c.get(Calendar.YEAR));
        System.out.println("The current month"+c.get(Calendar.MONTH));
        System.out.println("The current week"+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("The current hour"+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("The current minute"+c.get(Calendar.MINUTE));
        System.out.println("The current second"+c.get(Calendar.SECOND));
        c.add(Calendar.YEAR, 4);
        System.out.println("after 4 years"+c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("before 12 years"+c.getTime());
        c.add(Calendar.MONTH, 4);
        System.out.println("after 4 months"+c.getTime());
        System.out.println(c.getWeeksInWeekYear());
        System.out.println(c.getMaximum(Calendar.WEEK_OF_YEAR));


    }
}
