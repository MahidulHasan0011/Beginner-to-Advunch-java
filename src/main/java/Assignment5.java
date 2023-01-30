
import java.util.Scanner;


public class Assignment5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
         System.out.print("Enter Your Age");
        int age=input.nextInt();
        if(age>18){
        System.out.print("valid voter");
        }
        else if (age<18){
             System.out.print("nvalid voter");
        }
        
    }
}
