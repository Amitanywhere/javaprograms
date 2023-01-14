
import java.text.SimpleDateFormat;
import java.util.*;

public class DateClass {

    public static void main(String[] args) {
        Date dateA = new Date();
        long timeNow = dateA.getTime();
        System.out.println("Time now in miliseconds - " + timeNow);

        // showing date and time using toString()
        System.out.println("Date and Time now - " + dateA.toString());

        // format date using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("E yyyy-MM-dd 'at' hh:mm:ss a zzz ");
        System.out.println("Current date - " + dateFormat.format(dateA));

        Date dateB = new Date();
        dateB.setTime(1276567886666l);
        System.out.println("dateB - " + dateFormat.format(dateB));
        boolean isAfter = dateA.after(dateB);
        System.out.println("date after dateB - " + isAfter);
        boolean isBefore = dateA.before(dateB);
        System.out.println("date before dateB - " + isBefore );

        // date cloning
        Object dateCloneA = dateA.clone();
        System.out.println("Date clone A - " + dateCloneA.toString());

        // using compareTo method
        int compare1 = dateA.compareTo(dateB); // dateA > dateB
        System.out.println(compare1);

        int compare2 = dateB.compareTo(dateA); // dateB < dateA
        System.out.println(compare2);

        // equal method
        boolean isEqual = dateA.equals(dateCloneA);
        System.out.println("dateA equals dateCloneA - " + isEqual );

        boolean isEqual1 = dateA.equals(dateB);
        System.out.println("dateA equals dateB - " + isEqual1 );

        // getTime method
        long time1 = dateA.getTime();
        long time2 = dateB.getTime();
        System.out.println("DateA time - " + time1);
        System.out.println("DateB time - " + time2);
    }
}
