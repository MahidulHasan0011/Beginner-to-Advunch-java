
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TimeDemo {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        
        DateTimeFormatter formatTime= DateTimeFormatter.ofPattern("hh:mm:ss");
        String CurrentTime=formatTime.format(time);
        System.out.println("CurrentTime"+CurrentTime);
    }
}
