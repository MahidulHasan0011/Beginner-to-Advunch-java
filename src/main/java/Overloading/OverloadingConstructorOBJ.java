/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author DELL
 */
public class OverloadingConstructorOBJ {
    public static void main(String[] args) {
        OverloadingConstructorClass var =new OverloadingConstructorClass();
        
         OverloadingConstructorClass var1 =new OverloadingConstructorClass("mhi","male");
         var1.PrintInfo();
         
          OverloadingConstructorClass var2 =new OverloadingConstructorClass("hasan","male",111111);
          var2.PrintInfo();
    }
   
}
