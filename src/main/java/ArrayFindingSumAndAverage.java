
import java.util.Scanner;

public class ArrayFindingSumAndAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 5 number :");
        
        int[] number; //decleare a array
        number = new int[5]; //creat a array
        int sum = 0;
        
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        int max = number[0];
        int min = number[0];
        for(int i=1;i<number.length;i++){
            if(max<number[i]){
            max=number[i];
            }
            else if(min>number[i]){
            min=number[i];
            }
            
        }
        
        
        System.out.println("sum" + sum);
        int avg = sum / number.length;
        System.out.println("avg" + avg);
        System.out.println("max"+max);
        System.out.println("min"+min);

    }
}
