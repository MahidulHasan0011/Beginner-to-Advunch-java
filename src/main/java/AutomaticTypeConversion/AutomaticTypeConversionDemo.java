/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AutomaticTypeConversion;



/**
 *
 * @author DELL
 */
public class AutomaticTypeConversionDemo {
   
    void add(double a,double c){
        System.out.println(a+c);
   }
     void add(int a ,int b,int c){
         System.out.println(a+b+c);
   }
      void add(){
          System.out.println("Nothing to Add");
   }
      public static void main(String[] args) {
        AutomaticTypeConversionDemo ob=new AutomaticTypeConversionDemo();
         ob.add(5,5);
         ob.add(10,7,5);
        
         ob.add();
    }
}
