package Java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PersonInYearsIfTheBirthdayHasGiven {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2012, 8, 9);
        LocalDate today = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(date, today));

    }
}
