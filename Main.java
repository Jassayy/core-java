import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        /*
         * Dob -> localDate
         * Check if the person is:
         * 
         * "MINOR" (< 18)
         * 
         * "ADULT" (18–59)
         * 
         * "SENIOR" (60+)
         * 
         * calculate age
         * 
         */

        LocalDate dob = LocalDate.of(2004, Month.FEBRUARY, 19);
        // System.out.println(dob.getDayOfWeek());
        // System.out.println(dob.getDayOfMonth());

        LocalDate todayDate = LocalDate.now();

        // long numberOfDays = ChronoUnit.DAYS.between(dob, todayDate);
        long years = ChronoUnit.YEARS.between(dob, todayDate);
        System.out.println(years);

        if (years < 18) {
            System.out.println("Minor");
        } else if (years >= 18 && years < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        Period period = Period.between(dob, todayDate);

        int year = period.getYears();
        System.out.println(year);
        int month = period.getMonths();
        System.out.println(month);
        int days = period.getDays();
        System.out.println(days);


    }
}