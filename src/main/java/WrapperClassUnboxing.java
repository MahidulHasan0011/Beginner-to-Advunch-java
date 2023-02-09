
public class WrapperClassUnboxing {
    public static void main(String[] args) {
        Double x =new Double(10.55);
        double y=x.doubleValue();
        System.out.print("y = "+y);
        
         double z=x;//z.doubleValue();UNBOXING
        System.out.print("z = "+z);
    }
}
