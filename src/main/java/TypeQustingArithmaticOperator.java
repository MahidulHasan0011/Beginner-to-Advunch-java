
import java.util.Scanner;


public class TypeQustingArithmaticOperator {
    public static void main(String [ ]args){
        
         int num1,num2,result; 
//    Scanner input = new Scanner (System.in);
//       System.out.println("Enter first number ");
//        num1= input.nextInt();
//       System.out.println("Enter last number ");
//         num2= input.nextInt();
    num1=20;
    num2=3;
    result= num1+num2;
    System.out.println("Add "+result);
    
     result= num1-num2;
    System.out.println("Minus"+result);
    
     result= num1*num2;
    System.out.println("Multi"+result);
    
    double result2= (double)num1/num2;
    System.out.println("Division2"+result2);
     result= num1%num2;
    System.out.println("Reminder"+result);
    
    }
    
}
