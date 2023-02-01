
import java.util.Scanner;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number :");
        int userInt=input.nextInt();
        int temporary=userInt;
        int sum =0;
        while(temporary !=0){
            
            int Return =temporary %10;
            sum=sum+Return;
            temporary=temporary/10;
        }
        System.out.println(" "+sum);
    }
}
