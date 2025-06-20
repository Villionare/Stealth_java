import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(dateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM:yyyy");
        String formatted = dateTime.format(dtf);

        String formattedLocalDate = localDate.format(df);
        System.out.println(formattedLocalDate);
        System.out.println(formatted);
    }
}
