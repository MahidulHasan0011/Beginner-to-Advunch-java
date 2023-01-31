
import java.util.Scanner;


public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,userInput,factorial=1;
        System.out.println("Enter a value :");
        userInput=input.nextInt();
        for(i=userInput;i>=1;i--){
           
            factorial=factorial*i;
            
        
        }
//        System.out.println("factorial of"  +userInput+ "=" +factorial);
System.out.println("fwctorial of"+userInput +"="+factorial);
    }
}
