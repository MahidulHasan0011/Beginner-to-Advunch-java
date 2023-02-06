
import java.util.ArrayList;
import java.util.Collections;



public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>Arr=new ArrayList<>();
        Arr.add(10);
        Arr.add(-2);
        Arr.add(30);
        Arr.add(40);
        
        System.out.print("ARR"+Arr);
        
       Collections.sort(Arr);
       
        System.out.print("sort array"+Arr);
        
        Collections.sort(Arr,Collections.reverseOrder());
        
        System.out.println("Reverse An Array sort"+Arr);
        
    }
}
