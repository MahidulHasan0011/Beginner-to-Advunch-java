
import java.util.Scanner;


public class CheckVioul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.print("enter a Letter between a-z :");
          char lettre=input.next().charAt(0);
          
          
          if(lettre=='a' ||lettre=='e' || lettre=='i' || lettre=='o'||lettre=='u'){
        System.out.println("vioul");
    }
          else{
                System.out.println("not  vioul");
          }
    }
}
