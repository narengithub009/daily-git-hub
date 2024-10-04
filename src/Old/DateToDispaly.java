package Old;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public interface DateToDispaly {
    public static void main(String[] args) {
        var date = LocalDateTime
                .now()
                .format(DateTimeFormatter.ofPattern("dd/mm/yyyy"));
        System.out.println(date);
    }
}
