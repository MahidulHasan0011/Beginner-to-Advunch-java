/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InstanceVariableHiding;

/**
 *
 * @author DELL
 */
public class InstanceVariableHidingClass {
    double height ,width,depth;
    InstanceVariableHidingClass(double height,double width,double depth){
       this.height=height;
       this.width=width;
       this.depth=depth;
    }
    void Display(){
    double vol=height*width*depth;
        System.out.println("volium is"+vol);
    }
    public static void main(String[] args) {
        InstanceVariableHidingClass box1=new InstanceVariableHidingClass(10,10,10);
        box1.Display();
        InstanceVariableHidingClass box2=new InstanceVariableHidingClass(10,10,10);
        box2.Display();
    }
   
}
