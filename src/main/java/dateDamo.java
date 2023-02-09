
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class dateDamo {
    public static void main(String[] args) {
      Date today =new Date();
      DateFormat formated = new SimpleDateFormat("MM/dd/YYY");
      String TodayDate=formated.format(today);
        System.out.println("TodayDate "+TodayDate);
        
    }
 
}
