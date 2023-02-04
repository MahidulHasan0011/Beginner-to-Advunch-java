
import java.util.Scanner;


public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int [][] A=new int[3][3];
        int sumOfDiagonalElement=0;
         int sumOfUpperElement=0;
          int sumOfLowerElement=0;
        //gatting input from user for A metrix
        System.out.println("Enter Element For A Metrix :");
        for(int row=0;row<3;row++){
        for(int col=0;col<3;col++){
        System.out.printf("A[%d][%d] = ",row ,col);
          A[row][col]=input.nextInt();
        }
        }
        
          for(int row=0;row<3;row++){
        for(int col=0;col<3;col++){
         if(row==col){
           sumOfDiagonalElement+=  A[row][col]; 
         }
         else if(row<col){
          sumOfUpperElement+=  A[row][col]; 
         }
          else if(row>col){
          sumOfLowerElement +=  A[row][col]; 
         }
        }
        }
          
          System.out.println("Sum of Diagonal Element is :"+sumOfDiagonalElement);
           System.out.println("Sum of Upper Element is :"+sumOfUpperElement);
            System.out.println("Sum of Lower Element is :"+sumOfLowerElement);
    }
    
}
