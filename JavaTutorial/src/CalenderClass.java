import java.util.*;

public class CalenderClass {

    public static void main(String[] args) {
        Calendar calender1 = Calendar.getInstance();
        System.out.println("Current Date is - " + calender1.getTime());

        // different methods
        System.out.println("Current date - " + calender1.get(calender1.DATE));

        System.out.println("Current Year - " + calender1.get(calender1.YEAR));

        System.out.println("Current Minute - " + calender1.get(calender1.MINUTE));

        System.out.println("Current Seconds - " + calender1.get(calender1.SECOND));

        // getMaximum method
        int maxDay = calender1.getMaximum(calender1.DAY_OF_WEEK);
        System.out.println("Max Day of week - " + maxDay);

        int maxWeek = calender1.getMaximum(calender1.WEEK_OF_YEAR);
        System.out.println("Max Week of Year - " + maxWeek );

        // getMinimum method
        int minDay = calender1.getMinimum(calender1.DAY_OF_WEEK);
        System.out.println("Min Day of week - " + minDay);

        int minWeek = calender1.getMinimum(calender1.WEEK_OF_YEAR);
        System.out.println("Min week of month - " + minWeek);

        // add method
        calender1.add(calender1.DATE , -10);
        System.out.println("10 days before date - " + calender1.getTime());

        calender1.add(calender1.MONTH , 4);
        System.out.println("4 month after date - " + calender1.getTime() );

        calender1.add(calender1.YEAR , 2);
        System.out.println("2 year after date - " + calender1.getTime());
    }
}
