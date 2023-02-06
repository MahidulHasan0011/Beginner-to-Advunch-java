
import java.util.ArrayList;


public class ArrayListPart3 {
    public static void main(String[] args) {
        ArrayList <Integer> Arr1=new ArrayList<> ();
        ArrayList <Integer> Arr2=new ArrayList<> ();
        ArrayList <Integer> Arr3=new ArrayList<> ();
        
        Arr1.add(10);
        Arr1.add(20);
        Arr1.add(30);
          System.out.println("Arr1 "+Arr1);  
          
        Arr2.add(1);
        Arr2.add(2);
        Arr2.add(3);
          System.out.println("Arr2"+Arr2);
        
        Arr3.addAll(Arr1);
        
        
        System.out.println("Arr3"+Arr3);
        
       boolean Equal= Arr1.equals(Arr3);
       
       System.out.println("Arr1=Arr3 ?"+Equal);
       
       Equal= Arr1.equals(Arr2);
       System.out.println("Arr1=Arr2 ?"+Equal);
        
    }
}
