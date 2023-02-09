
public class WrapperClassAutoboxing {
    public static void main(String[] args) {
        int x =20;
        Integer y=Integer.valueOf(x);
        System.out.println("Y = "+y);
        
         Integer z=x;//Integer.valueOf(x);AUTOBOXING   
        System.out.println("z = "+z);
    }
}
