
public class StringBuffer1 {
    public static void main(String[] args) {
        String Fname ="mhi";
        StringBuffer name = new StringBuffer(Fname);
        System.out.println(name);
        name.append("Hasan");
         System.out.println(name);
        name.reverse();
         System.out.println(name);
         name.delete(0, 4);
         System.out.println(name);
         name.setLength(5);
         System.out.println(name);
        int length= name.length();
         System.out.print("setLength" +length);
    }
}
