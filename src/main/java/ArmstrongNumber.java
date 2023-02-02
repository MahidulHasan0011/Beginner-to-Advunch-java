
import java.util.Scanner;


public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        int sum=0,returnValue,num,temp;
        System.out.println("Enter a int number");
        num=intput.nextInt();
        temp=num;
        while(temp !=0){
        returnValue=temp%10;
        sum=sum+returnValue*returnValue*returnValue;
        temp=temp/10;
        
        }
        if(num==sum){
            System.out.println("ArmstrongNumber\n"+sum);
        }
        else{
        System.out.println("Not A ArmstrongNumber");
        }
        
    }
 
}
