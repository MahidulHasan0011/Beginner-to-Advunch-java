
import java.util.Scanner;


public class LoopProblemAndSolve2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int initalValue,finalValue,sum=0,i;
        System.out.println("Enter a initial value :");
        initalValue=input.nextInt();
        
        System.out.println("Enter a final value :");
        finalValue=input.nextInt();
        
        for(i=initalValue;i<=finalValue;i++){
        sum+=i;
        }
        System.out.println("The sum is ="+sum);
    }
}
