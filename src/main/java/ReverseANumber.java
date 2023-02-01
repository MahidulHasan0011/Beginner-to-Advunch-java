
import java.util.Scanner;


public class ReverseANumber {
    public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
        System.out.println("Enter a number :");
        int userInt=input.nextInt();
        int temporary=userInt;
        int sum =0;
        while(temporary !=0){
        int r=temporary%10;
        sum=sum*10+r;
        temporary=temporary/10;
        }
        System.out.println(" "+sum);
    }
}
