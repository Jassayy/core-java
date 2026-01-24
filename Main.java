import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        LocalDate manufacturedDate = LocalDate.of(2026, Month.JANUARY, 24);

        System.out.println("Manufactirung Date : " + manufacturedDate);
        // calculate expiry date
        // check whether product is expired valid or expiring soon(within 30 days)
        int expiredPeriodInMonths = 6;

        LocalDate expiryDate = manufacturedDate.plusMonths(expiredPeriodInMonths);

        System.out.println("Expiry Date : " + expiryDate);

        if ((LocalDate.now()).isAfter(expiryDate)) {
            System.out.println("Expired");
        } else if (ChronoUnit.DAYS.between(LocalDate.now(), expiryDate) <= 30) {
            System.out.println("Is Expiring soon");
        } else {
            System.out.println("Valid");

        }

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = d1.plusDays(7);

        System.out.println(ChronoUnit.DAYS.between(d1, d2));
    }
}