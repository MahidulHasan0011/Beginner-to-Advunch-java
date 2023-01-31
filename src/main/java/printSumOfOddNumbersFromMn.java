
import java.util.Scanner;


public class printSumOfOddNumbersFromMn {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int min,max,sum=0,i;
        System.out.println("Enter min number :");
        min=input.nextInt();
        System.out.println("Enter max number :");
        max=input.nextInt();
        i=min;
        while(i<max){
            
            i++;
            if(i%2!=0){
            sum+=i;
//                System.out.println(" sum+=i;"+sum);
//            sum=sum+i

            }
        }
         System.out.println("Sum of odd numbers from "+min+" to "+max+": "+sum);
    }
}
