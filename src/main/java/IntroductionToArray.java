
public class IntroductionToArray {
    public static void main(String[] args) {
        int [] number = new int[5];
        
        int [] number2;
        number2 = new int[10];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        System.out.println("number of array length is"+number.length);
        int sum=number[0]+ number[1]+ number[2]+number[3]+number[4];
        System.out.println("sum : "+sum);
    }   
}
