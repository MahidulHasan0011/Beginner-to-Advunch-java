
import java.util.Scanner;


public class findFactorialOfN {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int number=input.nextInt();
        int factorial=number;
        int i=1;
        while(i<number){
        factorial*=number-i;
          i++;
        }
         System.out.println("The Factorial is: "+factorial);
        
    }
}
    





