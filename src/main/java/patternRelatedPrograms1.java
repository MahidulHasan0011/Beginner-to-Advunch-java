

import java.util.Scanner;


public class patternRelatedPrograms1 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
         int num=input.nextInt();
         for(int row=1;row<=num;row++){
         for(int col=1;col<=row;col++){
             System.out.print(""+col);
         }
             System.out.println("");
         }
         
          for(int row=1;row<=num;row++){
         for(int col=1;col<=row;col++){
             System.out.print("*");
         }
             System.out.println("");
         }
          
          
           for(int row=1;row<=num;row++){
         for(int col=1;col<=row;col++){
             System.out.print("#");
         }
             System.out.println("");
         }
    }
 
}
