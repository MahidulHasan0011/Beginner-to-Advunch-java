
import java.util.Scanner;


public class FibonacciSeriesWithoutRecursion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("How many number :");
        int UserInput=input.nextInt();
        int First=0;
        int Second=1;
        int fibonacci;

        
        for(int i=3;i<=UserInput;i++){
         fibonacci=First+Second;
            System.out.print(" "+fibonacci);
            First=Second;
            Second=fibonacci;
        }
        System.out.println("");
        
    }
}
