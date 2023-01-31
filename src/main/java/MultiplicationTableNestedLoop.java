
import java.util.Scanner;


public class MultiplicationTableNestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,min,max,res;
        System.out.println("enter min value :");
        min=input.nextInt();
       
        
        System.out.println("enter max value :");
        max = input.nextInt();
        
        for(i=min;i<=max;i++){
           System.out.println("\n");
            for(int x=1;x<=10;x++){
            
                System.out.println(i+"x"+x+"="+i*x);
            }
//            
        }
    }
}
