
import java.util.Scanner;

public class Assignment14PalindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temporary, sum = 0, ret, count = 0;
    
    
    
  
        
        System.out.println("Enter nim number:");
        int nim = input.nextInt();
        System.out.println("Enter max number:");
        int max = input.nextInt();
        
        
        for (int i=nim; i <= max; i++) {
            temporary = i;
            while (temporary != 0 && i>10) {
                ret = temporary % 10;
                sum = sum * 10 + ret;
                temporary = temporary / 10;
            }
            if (sum == i) {
                System.out.println("Palindrome numbers from: " + i);
                count++;
            }
            sum = 0;
        }
        System.out.println();
        System.out.println("Total Palindrome numbers from " + nim + " to " + max + " are:" + count);
   }
}
    