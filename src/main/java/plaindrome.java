
import java.util.Scanner;


public class plaindrome {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int Sum,Num,Temp,Return;
        System.out.print("Enter a inte Number :");
        Sum=0;
        Num=input.nextInt();
        Temp=Num;
        while(Temp!=0){
        Return=Temp%10;
        Sum=Sum*10+Return;
        Temp=Temp/10;
        
        }
        
        if(Num ==Sum){
            System.out.println("plaindrome \n" +Sum);
        }else{
        System.out.println("not plaindrome"+Sum);
        }
    }
  
}
