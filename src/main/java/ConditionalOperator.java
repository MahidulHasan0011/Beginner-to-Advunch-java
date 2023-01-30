
import java.util.Scanner;


public class ConditionalOperator {
    public static void main(String[] args) {
              Scanner input= new Scanner(System.in);
        System.out.print(" Enter Two number :");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int large=(num1>num2)?num1:num2;
          System.out.print(" larger number is:"+large );
    }
}
