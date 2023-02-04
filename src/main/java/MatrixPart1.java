
import java.util.Scanner;

public class MatrixPart1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
         int[][] C = new int[2][3];

        //gatting input from user for A metrix
        System.out.println("Enter Element For A Metrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
               
                A[row][col] = input.nextInt();
//          
            }
        }
        //gatting input from user for B metrix
        System.out.println("Enter Element For B Metrix :");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
               System.out.printf("B[%d][%d] = ",row ,col);
                B[row][col] = input.nextInt();
//          
            }
        }

        //printing input A metrix
        System.out.print(" A = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + A[row][col]);

            }
            System.out.println("");
        }
         System.out.println("\n\n");
        //printing input  B metrix
        System.out.print(" B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + B[row][col]);

            }
            System.out.println("");
        }
        
            //Adding input A  and B metrix print
            
        System.out.println("\n\n");
        System.out.print(" A+B = ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                C[row][col]=A[row][col]+B[row][col];
                 System.out.print("\t " + C[row][col]);
//                System.out.print("\t " + (A[row][col]+B[row][col]));

            }
            System.out.println("");
        }

    }
}
