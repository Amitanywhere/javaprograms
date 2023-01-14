import java.util.TimeZone;

public class TimeZoneExample {

    public static void main(String[] args) {
        String[] allTimeZones = TimeZone.getAvailableIDs();
        System.out.println("Total Timezone - " + allTimeZones.length);
//        System.out.println("list of time zones");
//
//        for(String timeZone : allTimeZones){
//            System.out.println(timeZone);
//        }

        // get local timeZone
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("TimeZone details - " + timeZone);
        System.out.println("Timezone id - " + timeZone.getID());
        System.out.println("Timezone " + timeZone.getDisplayName());
        int timeInMiliSeconds = timeZone.getDSTSavings();
        System.out.println("TimeZone time miliseconds - " + timeInMiliSeconds);
    }
}
