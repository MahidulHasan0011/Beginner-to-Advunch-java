
import java.util.Locale;


public class StringPart2 {
    public static void main(String[] args) {
        String FastName="mahidul";
        String LastName="Hasan";
        String FullName=FastName.concat(LastName);
        System.out.print("concat : "+FullName+"\n");
        String UperName=FullName.toUpperCase(Locale.ITALY);
        System.out.print("UperName :"+UperName+"\n");
        String LoweName=FullName.toLowerCase(Locale.ITALY);
        System.out.print("LoweName :"+LoweName+"\n");
        
        boolean StartWith=FastName.startsWith("mah");
        System.out.println("StartWith :"+StartWith+"\n");
        
         boolean EndWith=LastName.endsWith("san");
        System.out.println("EndWith :"+EndWith+"\n");
        
        
        String []Arr={"Apple","banana","ccc"};
        for(String X:Arr){
            System.out.println("x=" +X);
        
        }
    }
   
}
