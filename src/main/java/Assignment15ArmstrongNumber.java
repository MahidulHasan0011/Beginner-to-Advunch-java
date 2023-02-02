
import java.util.Scanner;


public class Assignment15ArmstrongNumber {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int temporary, sum = 0, ret, count = 0; 
        System.out.println("Enter nim number:");
        int nim = input.nextInt();
        System.out.println("Enter max number:");
        int max = input.nextInt();
        for(int i=nim;i<=max;i++){
            temporary=i;
            while(temporary !=0){
            ret=temporary%10;
            sum=sum+ret*ret*ret;
            temporary=temporary/10;
            }
            if(sum ==i){
                System.out.println("Assignment numbers from: " + i);
                count++;
            }
            sum=0;
        
        }
        System.out.println("");
        System.out.println("Total Assignment numbers from " + nim + " to " + max + " are:" + count);
    }
}
