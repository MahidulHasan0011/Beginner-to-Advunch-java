/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism.RunTime;

/**
 *
 * @author DELL
 */
public class tringle extends Shape {
     double base, height;
    
    tringle(double base,double height ){
    this.base=base;
    this.height=height;
    
    }
    double area(){
        System.out.print("tringle ");
        return 0.5*base*height;
    }
}
