import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.GregorianCalendar;

public class MyTime {
    public static void main(String[] args) {
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println("Current DateTime Before Formatting: " + now);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm/dd/yyyy");
//        String formatedDateTime = now.format(formatter);
//        System.out.println("Current DateTime after Formatting:: " + formatedDateTime );


//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        LocalDate todaysDate = LocalDate.now();
//        LocalDate adjustedMonth1 = LocalDate.now().minusMonths(3);
//        LocalDate adjustedMonth2 = LocalDate.now().minusMonths(3);
//        LocalDate todaysDate = LocalDate.of(2023, 2, 14);
//        LocalDate firstDayPreviousMonth = adjustedMonth1.with(TemporalAdjusters.firstDayOfMonth())
//                .minusMonths(1);
//        System.out.println("First day of previous month: " + firstDayPreviousMonth.format(formatter));
//        LocalDate lastDayPreviousMonth = adjustedMonth2.with(TemporalAdjusters.lastDayOfMonth())
//                .minusMonths(1);
//        System.out.println("Last day of previous month: " + lastDayPreviousMonth.format(formatter));


        // get TemporalAdjuster with last day
        // of the month adjuster
        TemporalAdjuster temporalAdjusterLastDay
                = TemporalAdjusters
                .lastDayOfMonth();

        TemporalAdjuster temporalAdjusterFirstDay
                = TemporalAdjusters
                .firstDayOfMonth();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        // using adjuster for local date-time
//        LocalDate localDate
//                = LocalDate.of(2024, 2, 24);
        LocalDate localDate = LocalDate.now().minusMonths(1);
        LocalDate localDate2 = LocalDate.now();
        LocalDate localDateMinusThirtyDays = localDate2.now().minusDays(30);
//        LocalDate localDate = LocalDate.now().plusMonths(5);

        LocalDate lastDayOfMonth
                = localDate.with(temporalAdjusterLastDay);

        LocalDate firstDayOfMonth
                = localDate.with(temporalAdjusterFirstDay);

        System.out.println("30 days ago from today (today/today minus thirty days) " +
                localDate2.format(formatter) +
                " / " + localDateMinusThirtyDays.format(formatter));

        System.out.println("first day of the "
                + "month for localdate "
                + localDate.format(formatter) + ": "
                + firstDayOfMonth.format(formatter));

        System.out.println("last day of the "
                + "month for localdate "
                + localDate.format(formatter) + ": "
                + lastDayOfMonth.format(formatter));
    }
}
