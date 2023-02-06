
public class StringPart3 {
    public static void main(String[] args) {
        String country="  i love Bangladesh"   ;
        System.out.println("country"+country);
        char findValue= country.charAt(0);
        System.out.println("charAt "+findValue);
        
          int AskyValue=country.codePointAt(3);
          System.out.println("codePointAt "+AskyValue);
          
          int indexNumber=country.indexOf("a");
          System.out.println("indexOf "+indexNumber);
          
          int LastindexNumber=country.lastIndexOf("a");
          System.out.println("lastIndexOf "+LastindexNumber);
          String count=country.trim();
          System.out.println("trim "+count);
          
    }
}
