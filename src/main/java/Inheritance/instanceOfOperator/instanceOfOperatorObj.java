/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.instanceOfOperator;

/**
 *
 * @author DELL
 */
public class instanceOfOperatorObj {
    public static void main(String[] args) {
        Animal a = new Animal();
        person p =new person();
        teacher t =new teacher();
        
        System.out.println(a instanceof Animal);
        System.out.println(p instanceof Animal);
        System.out.println(t instanceof person);
        System.out.println(t instanceof Animal);
        System.out.println(p instanceof teacher);
       
        
    }
}
