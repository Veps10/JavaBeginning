import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class dates {
    public static void main(String[] args) {
        LocalDate dateFrom = LocalDate.of(2020, 8, 12);
        LocalDate dateTo = LocalDate.of(2023, 11, 19);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
        System.out.println(noOfDaysBetween);
    }
}
