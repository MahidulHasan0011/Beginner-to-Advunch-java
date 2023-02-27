/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anonymousclass;

/**
 *
 * @author DELL
 */
public class child{
    public static void main(String[] args) {
        parents  p = new parents(){
            
            @Override
            void print(){
                System.out.println("in child class");
            }
         
        };
        p.print();
       
    }
      
    
}
