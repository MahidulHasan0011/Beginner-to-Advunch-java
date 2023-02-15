
package staticVariable;


public class studentClass {
    static int Count =0;
    studentClass(){
    Count++;
    }
    void PrintRes(){
        System.out.print("Total Student in system : "+Count);
        System.out.println("");
    }
}
