import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date);

        LocalDate date2 = LocalDate.of(2045, Month.FEBRUARY, 19);

        System.out.println(date2);

        LocalDate date3 = LocalDate.parse("2026-12-03");
        System.out.println(date3);

        LocalDate date4 = LocalDate.now();

        System.out.println(date4.toString() + " " + date4.hashCode());
        date4 = date4.plusDays(5);
        System.out.println(date4.toString() + " " + date4.hashCode()); // both hashcodes are different

        // get values from local date
        LocalDate date5 = LocalDate.now();
        System.out.println(date5.getYear()); // 2026
        System.out.println(date5.getMonth()); // january
        System.out.println(date5.getMonthValue()); // 1
        System.out.println(date.getDayOfMonth()); // 24
        System.out.println(date5.getDayOfYear()); // 24
        System.out.println(date5.getDayOfWeek()); // saturday

        LocalDate date6 = LocalDate.of(2026, Month.JANUARY, 30);

        date6 = date6.plusDays(5);
        System.out.println(date6);
        date6 = date6.plusMonths(1);
        System.out.println(date6);
        date6 = date6.plusYears(4);
        System.out.println(date6);

        // isBefore isAfter
        System.out.println(date6.isAfter(date5));

        // date time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String dStr = "2026-04-06";

        LocalDate date7 = LocalDate.parse(dStr, formatter);
        System.out.println(date7.getClass());
        System.out.println(date7.getEra());

        String datestr = date7.toString();
        System.out.println(datestr);

    }
}
