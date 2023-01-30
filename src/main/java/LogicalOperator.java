
import java.util.Scanner;


public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a Letter :");
        char letter=input.next().charAt(0);
        if(letter>='a' && letter<='z'){
            System.out.println("small");
        }
        else if (letter>='A'&&letter<='z'){
            System.out.println("Capital");
        }
        else{
            System.out.println("invalid");
        }
    }
}
