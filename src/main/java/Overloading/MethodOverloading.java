/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author DELL
 */
public class MethodOverloading {
   void add(int a,int b){
       System.out.println(a+b);
   } 
    void add(double a,double c,int b){
        System.out.println(a+b+c);
   }
     void add(int a ,int b,int c){
         System.out.println(a+b+c);
   }
      void add(){
          System.out.println("Nothing to Add");
   }
      public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
         ob.add(5,5);
         ob.add(10,7,5);
         ob.add(10.2,22.9,3);
         ob.add();
    }   
     
}
