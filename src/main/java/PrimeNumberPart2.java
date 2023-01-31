
import java.util.Scanner;


public class PrimeNumberPart2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int userInput;
        int count=0;
        System.out.println("Enter a int number:");
        userInput=input.nextInt();
        
        if(userInput ==0 ||userInput==1){
            System.out.println("Not a Prime Numer");
        }else{
        
        for(int i=2;i<userInput/2;i++){
            
            if(userInput%i ==0){
              count++;
              break;
            }
        
        }
        if(count ==0){
            System.out.println("prim number");
        }
        else{
            System.out.println("Not a Prime Numer");
        }
        }
        
    }
    
}
