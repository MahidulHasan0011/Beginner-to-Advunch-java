
import java.util.Scanner;




public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int userInput;
        int count=0;
        System.out.println("Enter a int number:");
        userInput=input.nextInt();
        for(int i=2;i<userInput;i++){
           if(userInput%i==0){
           count++;
           break;
           }
        }
      
        if(count!=0){
            System.out.println("Not Prim Number");
        }
        else{
            System.out.println("Prim Number");
        }
        
  
    }
}
