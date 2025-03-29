import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class DateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now() ;
        LocalTime time = LocalTime.now();
        LocalDateTime dateAndTime = LocalDateTime.now();

        System.out.println("Local Date : " + date);
        System.out.println("Local Time : " + time);
        System.out.println("Local Date And Time : " + dateAndTime);

        LocalDate nextday = date.plusDays(1);   //
        System.out.println("Next Day" + nextday);

        LocalDate nextWeek = date.plusWeeks(1);
        System.out.println("Next Week : "  + nextWeek) ;


        

    }
}