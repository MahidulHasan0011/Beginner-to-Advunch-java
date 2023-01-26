
import java.util.Scanner;


public class ArithmeticOperator {
    public static void main(String[]args){
     int num1,num2,result;
    Scanner input = new Scanner (System.in);
       System.out.println("Enter first number ");
        num1= input.nextInt();
       System.out.println("Enter last number ");
         num2= input.nextInt();
//    num1=20;
//    num2=10;
    result= num1+num2;
    System.out.println("Add "+result);
    
     result= num1-num2;
    System.out.println("Minus"+result);
    
     result= num1*num2;
    System.out.println("Multi"+result);
    
     result= num1/num2;
    System.out.println("Division"+result);
     result= num1%num2;
    System.out.println("Reminder"+result);
    
    
    
    }
}
