
package oop;

public class ConstructorClass {
    String name,gender;
    int phone;
    
    //constructor
    ConstructorClass(String N,String G,int NUM){
    name=N;
    gender=G;
    phone=NUM;
    
    }
    void displayInfo(){
        System.out.println("name"+name);
        System.out.println("gender"+gender);
        System.out.println("phone"+phone);
        
    
    }
}
