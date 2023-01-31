
import java.util.Scanner;


public class SeriesPart1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        int a,sum6=0,userinput6;
        System.out.println("Enter a number :");
        userinput6=input.nextInt();
        for(a=1;a<=userinput6;a++){
             System.out.println(a+"X"+a);
        sum6+=a*a;
        }
         System.out.println("");
         System.out.println("sum"+sum6);
         
         
        
        double i,sum=0,userinput;
        System.out.println("Enter a double number :");
        userinput=input.nextDouble();
        for(i=1.5;i<=userinput;i++){
             System.out.print(" "+i);
        sum+=i;
        }
         System.out.println("");
         System.out.println("sum"+sum);
         
         
         
        
//        System.out.println("Enter a nyumber :");
//        int i,sum=0,userInput;
//        userInput=input.nextInt();
//        
//        for(i=1;i<=userInput;i++){
//            System.out.print(" "+i);
//            sum+=i;
//        }
//        System.out.println("");
//        System.out.println("sum"+sum);
        
        
        
        System.out.println("Enter a 2ndnyumber :");
        int y,sum2=0,userInput2;
        userInput2=input.nextInt();
        
        for(y=1;y<=userInput2;y=y+2){
            System.out.print(" "+y);
            sum2+=y;
        }
        System.out.println("");
        System.out.println("sum"+sum2);
        
        
        
        System.out.println("Enter a 3rdnyumber :");
        int x,sum3=0,userInput3;
        userInput3=input.nextInt();
        
        for(x=2;x<=userInput3;x=x+2){
            System.out.print(" "+x);
            sum3+=x;
        }
        System.out.println("");
        System.out.println("sum"+sum3);
    }
}
