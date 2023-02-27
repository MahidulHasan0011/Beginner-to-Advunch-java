/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalKeyword;

/**
 *
 * @author DELL
 */
public class inheritanceFinalMethod extends FinalMethod {
    
    
      void  dispaly2(){
         System.out.println("not final method");
     }
      public static void main(String[] args) {
        inheritanceFinalMethod obj = new inheritanceFinalMethod();
        obj.dispaly();
        obj.dispaly2();
    }
}
