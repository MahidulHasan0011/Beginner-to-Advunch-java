
import java.util.Scanner;


public class Assignment8logicalANDoperator {
    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        System.out.print(" have you completed your masters? y/n :");
        char ans = input.next().charAt(0);
        
        System.out.print(" have you fulent in English? y/n :");
        char ans2 = input.next().charAt(0);
        if(ans =='y' ||ans =='Y' && ans2 =='y'||ans2 =='Y'){
            System.out.println("you are eligible to for the job interview");
        }
       
         else if(ans =='n'||ans =='N' && ans2 =='n'||ans2 =='N'){
            System.out.println("Sorry. you are not eligible to for the job interview");
        }
      
          else{
            System.out.println("Sorry. you are not eligible to for the job interview");
          }
                
    }
}
