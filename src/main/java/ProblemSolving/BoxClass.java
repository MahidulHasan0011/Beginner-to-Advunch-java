/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProblemSolving;

/**
 *
 * @author DELL
 */
public class BoxClass {
    double height,width,depth;
    
    BoxClass(double h,double w,double d){
    height=h;
    width=w;
    depth=d;
    }
    void DisplayVol(){
        double vol=height*width*depth;
        System.out.println("volume is : "+vol);
    }
    
    public static void main(String[] args) {
        BoxClass Box1 = new BoxClass(10,10,10);
        BoxClass Box2 = new BoxClass(20,30,10);
        Box1.DisplayVol();
        Box2.DisplayVol();
    }
}
