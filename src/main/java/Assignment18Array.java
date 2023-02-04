
import java.util.Scanner;
public class Assignment18Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String [] week={"Saterday","Sunday","Monday","Twesday","Wednasday","Thusday","Fryday"};
        System.out.print("Enter day number (1-7) :");
        int dayNumber=input.nextInt();
        for(int i=0;i<=week.length;i++){
          if(dayNumber == i){
              System.out.println("Day Name is"+week[i-1]);
          
          }  
            
        }
     
    }
}
