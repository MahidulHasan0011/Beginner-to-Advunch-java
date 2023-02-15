/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package staticMethod;

/**
 *
 * @author DELL
 */
public class staticMethodsRestrictionsClass {
    static int id=0;
    void  nonSMethsd(){
        SMethod();
        
    
    }
    static void SMethod(){
        System.out.print("id ="+id);
        System.out.println("");
//          nonSMethsd(); //error
        System.out.print("SMethod");
         System.out.println("");
    }
        
    
    
}
