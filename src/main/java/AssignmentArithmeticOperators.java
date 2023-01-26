
import java.util.Scanner;


public class AssignmentArithmeticOperators {
    public static void main(String[]args){
   try(Scanner input =new Scanner(System.in)){
   int phonePrice = 1800;
    int numberOfInstallment, installmentPerMonth;
    System.out.println("numberOfInstallment :");
    numberOfInstallment = input.nextInt();
    System.out.println("numberOfInstallment"+numberOfInstallment);
    
    installmentPerMonth= phonePrice / numberOfInstallment;
    
     System.out.println("Monthly installment Amount: "+installmentPerMonth + " euros");
   
   
   }
      
    
    
    } 
}
