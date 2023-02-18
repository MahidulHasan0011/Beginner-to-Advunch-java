/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author DELL
 */
public class EncapsulationObj {
    public static void main(String[] args) {
        EncapsulationClass obj = new EncapsulationClass();
        obj.SetName("mahidul");
        
        System.out.print(obj.GetName() );
        System.out.println("");
        obj.setAge(25);
        System.out.println(obj.getAge());
    }
}
   