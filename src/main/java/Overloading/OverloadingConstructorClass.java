/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author DELL
 */
public class OverloadingConstructorClass {
       String Name,Gender;
   int phone;
   OverloadingConstructorClass(){
       System.out.print("NO INFO");
       System.out.println("");
   }
   
    OverloadingConstructorClass(String N,String G){
       Name=N;
       Gender=G;
   }
    
     OverloadingConstructorClass(String N,String G,int P){
       Name=N;
       Gender=G;
       phone=P;
   }
     
     void PrintInfo(){
         System.out.println("Name"+Name);
         System.out.println("Gender"+Gender);
         System.out.println("phone"+phone);
         
     }
}
