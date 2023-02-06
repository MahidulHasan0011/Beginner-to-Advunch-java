
public class StringPart4 {
    public static void main(String[] args) {
        String name="Mahidul";
        
        String ReplaceName=name.replace('M', 'A');
        System.out.println("replace "+ReplaceName);
        String comment="i_Love_my country";
        String [] SplitCountry=comment.split("_");
        for(String X:SplitCountry){
            System.out.println("SplitCountry "+X);
        }
        
        
    }
  
}
