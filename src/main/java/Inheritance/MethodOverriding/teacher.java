/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.MethodOverriding;

/**
 *
 * @author DELL
 */
public class teacher extends preson {
    
  String qualification;
  @Override
      void display(){
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("qualification "+qualification);
    }
}
