
import java.util.Scanner;


public class Assignment9switchStatement {
    public static void main(String[] args) {
          Scanner input =new Scanner(System.in);
        System.out.println("Enter a value :");
        int value=input.nextInt();
        switch(value){
            case 1 :
                System.out.println("language is Bengali");
            break;
             case 2 :
                System.out.println("language is Hindi");
            break;
             case 3 :
                System.out.println("language is Urdu");
            break;
            
             default :
                System.out.println("language is English");
           
            
        
        }
    }
}
