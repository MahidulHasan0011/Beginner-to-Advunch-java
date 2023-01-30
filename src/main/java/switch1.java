
import java.util.Scanner;


public class switch1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a value :");
        int value=input.nextInt();
        switch(value){
            case 1:
                System.out.println("one");
            break; 
            
            case 2:
                System.out.println("two");
            break;
            
            case 3:
                System.out.println("three");
            break;
            case 4:
                System.out.println("four");
            break;
            
            default:
                  System.out.println("not a number");
            
            
                
        }
    }
}
