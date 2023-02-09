
public class convirtStringToPRIMITIVEdata {
    public static void main(String[] args) {
        String age="26";
         String age2="26";
        int i =Integer.parseInt(age);
        System.out.print("Integer = "+i+"\n");
        double d=Double.parseDouble(age);
        System.out.print("Double ="+d+"\n");
        float f=Float.parseFloat(age);
        System.out.print("Float = "+f+"\n");
        
        float f2=Float.valueOf(age2);
        System.out.print("valueOf = "+f2+"\n");
        
    }
}
