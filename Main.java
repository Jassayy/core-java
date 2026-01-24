import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        /*
         * A subscription renews every month on the same day as signup.
         * 
         * You are given:
         * 
         * signupDate → LocalDate
         * 
         * currentDate → LocalDate
         * 
         * Task
         * 
         * Find the next billing date.
         * 
         * Edge cases
         * 
         * Signup on 31st
         * 
         * February month handling
         * 
         * Must use
         * 
         * plusMonths()
         * 
         * withDayOfMonth()
         * 
         * lengthOfMonth()
         * 
         * isAfter()
         */

        LocalDate signupDate = LocalDate.of(2024, Month.FEBRUARY, 29);

        LocalDate today = LocalDate.of(2026,01,29);

        int billingDay = signupDate.getDayOfMonth();

        LocalDate candidate = today.withDayOfMonth(
                Math.min(billingDay, today.lengthOfMonth()));

        // Step 2: if already passed, move to next month
        if (!candidate.isAfter(today)) {
            LocalDate nextMonth = today.plusMonths(1);
            candidate = nextMonth.withDayOfMonth(
                    Math.min(billingDay, nextMonth.lengthOfMonth()));
        }

        System.out.println("Signup Date : " + signupDate);
        System.out.println("Today : " + today);
        System.out.println("Next Billing : " + candidate);

    }
}