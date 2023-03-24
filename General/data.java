import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println(now);
        System.out.println("Date\t" + now.toLocalDate());
        System.out.println("Hour\t" + now.toLocalTime());
        System.out.println("Edited Date\t" + now.format(formatter));
        System.out.println("Year\t" + now.getYear());
        System.out.println("Month \t" + now.getMonthValue());
        System.out.println("Month Name: \t" + now.getMonth()); //MARCH
        System.out.println("DayOfMonth: \t" + now.getDayOfMonth());// 23
        System.out.println("DayOfWeek: \t" + now.getDayOfWeek());// THURSDAY
        System.out.println("Hour: \t" + now.getHour());
        System.out.println("Minute : \t" + now.getMinute()); 
        System.out.println("Second : \t" + now.getSecond()); 


    }
}
