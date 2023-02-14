/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author DELL
 */
public class DefaultParametrisedConstructorClass {
    String Name,Gender;
   
   //default Constructor
   
   DefaultParametrisedConstructorClass(){
       System.out.print("No datat");
   }
   DefaultParametrisedConstructorClass(String n,String g){
       
       Name=n;
       Gender=g;
   
   }
   void PrintData(){
       System.out.println("Name"+Name);
       System.out.println("Gender"+Gender);
   }
}
