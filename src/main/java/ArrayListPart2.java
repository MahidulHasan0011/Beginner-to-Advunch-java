
import java.util.ArrayList;


public class ArrayListPart2 {
    public static void main(String[] args) {
        ArrayList<Integer>ARR=new  ArrayList<>();
        ARR.add(10);
        ARR.add(20);
        ARR.add(30);
        ARR.add(3, 40);
         
       boolean check= ARR.isEmpty();
        System.out.println("check ="+check);
        System.out.println("");
//        ARR.clear();
//        System.out.println("clear "+ARR);
        
//        boolean checkis= ARR.isEmpty();
//        System.out.println("check ="+checkis);
        
        int index= ARR.indexOf(40);
        System.out.println("index of 40 is ="+index);

        boolean isAvailable=ARR.contains(30);
        System.out.println("30 is in the list ="+isAvailable);
        
        
        int replaceValue= ARR.set(3, 60);
        System.out.println("After satting of 3 index ="+ARR);
        
        int gattingValue= ARR.get(2);
        System.out.println("Index 2 value ="+gattingValue);
    }        
}
