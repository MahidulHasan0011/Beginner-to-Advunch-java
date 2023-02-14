
package oop;
public class parametrizeClass {
    String name,gender;
    int number;
    
    void SetInfo(String N,String g,int num){
       name=N;
       gender=g;
       number=num;
       
    }
    
    void DisplayInfo(){
        System.out.println("name = "+name);
        System.out.println("gender = "+gender);
        System.out.println("number = "+number);
        System.out.println("");
    }
    
}
