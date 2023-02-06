
import java.util.ArrayList;


public class ArrayListpart1 {
    public static void main(String[] args) {
        ArrayList <Integer>number=new ArrayList <>();
        System.out.print("Size of ArrayList is :"+number.size());
        System.out.println("");
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        
//        System.out.print(number);
for(int x:number){
    System.out.println(" "+x);
}
        System.out.println("");
        System.out.println("Size of ArrayList is"+number.size());
        
        
        number.remove(0);
        System.out.println("After removing Arraylist content : "+number );
        
        number.removeAll(number);
        System.out.println("After removing all Arraylist content : "+number );
        
        number.clear();
        System.out.println("After clear  Arraylist content : "+number );
    }
}
