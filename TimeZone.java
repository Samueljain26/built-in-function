import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZone {
    public static void main(String[] args) {
        // Define the required time zones
        ZoneId gmt = ZoneId.of("GMT");
        ZoneId ist = ZoneId.of("Asia/Kolkata");
        ZoneId pst = ZoneId.of("America/Los_Angeles");

        // Get the current time in each time zone
        ZonedDateTime gmtTime = ZonedDateTime.now(gmt);
        ZonedDateTime istTime = ZonedDateTime.now(ist);
        ZonedDateTime pstTime = ZonedDateTime.now(pst);

        // Format the date-time output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"); //y= year M=MONTH d=date H=hour m=minute s=second z=timezone

        // Display the results
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}
