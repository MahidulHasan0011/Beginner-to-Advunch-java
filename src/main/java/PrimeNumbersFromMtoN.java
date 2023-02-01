
import java.util.Scanner;

public class PrimeNumbersFromMtoN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min, max,count=0,totlaPrime=0 ;
       
        System.out.print("Enter a min number :");
        min = input.nextInt();
        System.out.print("Enter a max number :");
        max = input.nextInt();
        for (int i = min; i <= max; i++) {
             
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                totlaPrime++;
                System.out.println(i);
               
            }
             count = 0;

        }
        System.out.println("total prim  number"+totlaPrime);

    }
}
