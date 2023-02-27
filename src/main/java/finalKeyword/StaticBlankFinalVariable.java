/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalKeyword;

/**
 *
 * @author DELL
 */
public class StaticBlankFinalVariable {
    static final String NAME;  //Static Blank Final Variable
    final int AGE;// Blank Final Variable
    static{
        NAME="mhi";
        
    }
    StaticBlankFinalVariable(){
         AGE=27;
    }
    
    void print(){
        System.out.println("NAME "+NAME);
        System.out.println("AGE "+AGE);
    }
    public static void main(String[] args) {
        StaticBlankFinalVariable obj =new StaticBlankFinalVariable();
        obj.print();
    }
}
