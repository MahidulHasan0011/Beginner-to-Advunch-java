/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.superkeyword.ex;

public class vehical {
    String name;
    double weight;
    String color;
    vehical(String n,double w,String c ){
    
    name=n;
    weight=w;
    color=c;
    }
    
    void printres(){
        System.out.println("name ="+name);
        System.out.println("weight ="+weight);
        System.out.println("color ="+color);
    }
}
