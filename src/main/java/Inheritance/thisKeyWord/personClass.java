/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.thisKeyWord;


public class personClass {
    String name,hairColor;
    int age;
    personClass(String name,int age){
    this.name=name;
    this.age=age;
    
    }
    personClass(String name,int age,String hairColor){
    this(name,age);
    this.hairColor= hairColor;
    
    }
    
    void display(){
        System.out.println("name ="+name);
        System.out.println("age ="+age);
        System.out.println("hairColor ="+hairColor);
        
    }
}
