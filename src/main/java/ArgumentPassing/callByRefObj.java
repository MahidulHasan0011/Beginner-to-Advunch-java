/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArgumentPassing;

/**
 *
 * @author DELL
 */
public class callByRefObj {
    public static void main(String[] args) {
        CallByReferenceClass obj =new CallByReferenceClass();
        obj.Name="mhi";
        System.out.println("Before call "+ obj.Name);
        obj.chainge(obj);
        
         System.out.println("After call "+ obj.Name);
        
    }
}
