
package staticVariable;


public class staticVariable1Class {
    String name;
    int id;
    static String universityName="DIU";
    //constructor
    staticVariable1Class(String n,int i){
        name=n;
        id=i;
    
    }
    //method
    void printRes(){
        System.out.println("name "+name);
        System.out.println("id "+id);
        System.out.println("universityName "+universityName);
    }
}
