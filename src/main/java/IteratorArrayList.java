
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorArrayList {
    public static void main(String[] args) {
          ArrayList<Integer>num=new ArrayList<>();
          num.add(10);
          num.add(20);
          num.add(30);
          num.add(3, 40);
          
          System.out.println(" "+num.size());
          
          Iterator itr=num.iterator();
          while(itr.hasNext()){
              System.out.println("Iterator "+itr.next());
          
          }
    }

  
}
