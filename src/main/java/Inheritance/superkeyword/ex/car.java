/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.superkeyword.ex;

/**
 *
 * @author DELL
 */
public class car extends vehical {
     
    int gear;
    car(String n,double w,String c, int g){
     super( n, w, c);//calling the vehical constractor
     gear=g;
    
    }
    @Override
   void printres(){
   super.printres();
        System.out.println("gear ="+gear);
   }
    
}
