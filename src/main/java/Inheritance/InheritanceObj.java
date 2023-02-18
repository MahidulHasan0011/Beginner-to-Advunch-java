/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author DELL
 */
public class InheritanceObj {
    public static void main(String[] args) {
        teacher obj =new teacher();
        obj.name="mahidul";
        obj.age=27;
        obj.qulafication="bsc in swe";
        obj.printAllInfo();
        
        
        teacher obj1 =new teacher();
        obj1.name="mhi";
        obj1.age=29;
        obj1.qulafication="bsc in cse";
        obj1.printAllInfo();
    }
}
