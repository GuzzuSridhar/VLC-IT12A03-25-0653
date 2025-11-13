package dates;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now(); // current Date
        System.out.println(ld);
        System.out.println("---Access Date Fields---");
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getMonth());
        System.out.println(ld.getYear());
        System.out.println(ld.getDayOfYear());

        // Custom Date
        LocalDate dob = LocalDate.of(1974, 3, 16);
        System.out.println(dob);
        System.out.println(dob.getMonth() + "-" + dob.getDayOfMonth() + "-" + dob.getYear());

        System.out.println(dob.plusYears(50));
    }
}
