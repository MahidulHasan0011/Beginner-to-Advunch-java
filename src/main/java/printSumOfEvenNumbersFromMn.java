
import java.util.Scanner;


public class printSumOfEvenNumbersFromMn {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int initalValue,finalValue,sum=0,i;
        System.out.println("Enter a initial value :");
        initalValue=input.nextInt();  
        System.out.println("Enter a final value :");
        finalValue=input.nextInt();
        if(initalValue<finalValue){
            for(i=initalValue;i<=finalValue;i++){
             
           if(i%2==0){
             sum+=i;
          }
         
        }
        System.out.println("Sum of even numbers from "+initalValue+" to "+finalValue+": "+sum);
        } 
        else{
              System.out.println("invalid operation");
        }
        
         

    }
}
