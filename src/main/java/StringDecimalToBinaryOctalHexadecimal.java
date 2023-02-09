
import java.util.Scanner;


public class StringDecimalToBinaryOctalHexadecimal {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.print("Enter a number : ");
       int Decimal=input.nextInt();
       String Binary=Integer.toBinaryString(Decimal);
        System.out.print("Binary ="+Binary+"\n");
        String Octal=Integer.toOctalString(Decimal);
        System.out.print("Octal ="+Octal+"\n");
        String HexaDecimal=Integer.toHexString(Decimal);
        System.out.println("HexaDecimal ="+HexaDecimal+"\n");
    }
}
