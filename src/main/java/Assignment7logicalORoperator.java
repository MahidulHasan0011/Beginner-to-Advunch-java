
import java.util.Scanner;


public class Assignment7logicalORoperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter your openioun :");
        char openioun=input.next().charAt(0);
        if(openioun =='y'||openioun=='Y'){
            System.out.println(" you are a java lover");
        }
        else if(openioun =='n'||openioun=='N'){
         System.out.println(" you are not a java lover");
        }
        else{
            System.out.println("invalid");
        }
    }
    
}
