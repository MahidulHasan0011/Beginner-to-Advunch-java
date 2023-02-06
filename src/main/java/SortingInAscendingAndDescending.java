
import java.util.Arrays;


public class SortingInAscendingAndDescending {
    public static void main(String[] args) {
        int [] Arr={10,20,-3,1,22,33};
        Arrays.sort(Arr);
        System.out.print("Ascending Number is :");
        for(int i=0;i<6;i++){
            System.out.print(" "+Arr[i]);
        }
        System.out.println("");
        
        System.out.print("Descending Number is :");
        for(int i=5;i>=0;i--){
            System.out.print(" "+Arr[i]);
        }
        System.out.println("");
        
        String []Name={"pinky","sujoy","niloy","anis"};
        Arrays.sort(Name);
        System.out.println("Ascending Name is :");
          for(int i=0;i<4;i++){
            System.out.print(" "+Name[i]);
        }
        System.out.println("");
        
          System.out.print("Descending Name is :");
        for(int i=3;i>=0;i--){
            System.out.print(" "+Name[i]);
        }
         System.out.println("");
    }
}
