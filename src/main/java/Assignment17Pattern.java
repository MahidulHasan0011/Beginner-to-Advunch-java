
import java.util.Scanner;


public class Assignment17Pattern {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
         int num=input.nextInt();
        for(int row=1;row<=num;row++){
        for(int col=1;col<=row;col++){
            System.out.print(" "+col%2);
        }
         System.out.println(" ");
        }
    }
}
