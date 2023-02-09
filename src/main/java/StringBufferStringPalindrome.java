
public class StringBufferStringPalindrome {
    public static void main(String[] args) {
        String name="MADAM";
        StringBuffer SB=new StringBuffer(name);
        String FullName=SB.reverse().toString();
        if(name.equals(FullName)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }
        
    }
}
