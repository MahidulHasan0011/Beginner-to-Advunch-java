/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism.RunTime;

/**
 *
 * @author DELL
 */
public class ractengle extends Shape{
    
    double base, height;
    
    ractengle(double base,double height ){
    this.base=base;
    this.height=height;
    
    }
    double area(){
        System.out.print("ractengle ");
        return base*height;
    }
}
