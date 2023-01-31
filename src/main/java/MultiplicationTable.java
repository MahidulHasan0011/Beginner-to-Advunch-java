
import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
          int i,num;
        System.out.println("Enter a nmber :");
        num=input.nextInt();
         for(i=1;i<=10;i++){
               
             System.out.println(num +"x"+i+"="+num*i);
        }
         
         
}
}
