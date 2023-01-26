
public class FormatSpecifier {
    public static void main (String []args){
    boolean b = true ;  //        Dynamic Initialization
    char c = 'a';
    short s = 123;
    int i = 12345;
    float f =10.5f;
    double d = 10.4;
     
     
    System.out.printf("boolean b= %b  \n", b );
    System.out.printf("char c= %c \n",c );
    System.out.printf("short s= %d \n",s );
    System.out.printf("int i= %d \n",i );
    System.out.printf("float f= %.2f \n",f );
    System.out.printf("double d= %.1f \n",d );
    
    }
}
