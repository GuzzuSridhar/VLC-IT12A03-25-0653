package dates;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        // custom date fields
        System.out.println(lt.getHour() + ":" + lt.getMinute() + ":" + lt.getSecond());

        // Custom Time
        LocalTime l = LocalTime.of(10, 10);
        System.out.println(l);

        // time in a different zone
        LocalTime timeSg = LocalTime.now(ZoneId.of("Asia/Singapore")); // "Asia/Kolkata"
        System.out.println(timeSg);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:m a");
        System.out.println(timeSg.format(formatter));

    }
}
