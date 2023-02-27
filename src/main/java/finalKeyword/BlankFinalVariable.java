/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalKeyword;

/**
 *
 * @author DELL
 */
public class BlankFinalVariable {
    final String NAME; //blank final variable
    int age =26;
    BlankFinalVariable(){  //consrtuctor
       NAME="mhi";
    }
    void print(){
    
        System.out.println("NAME ="+NAME);
        System.out.println("age ="+age);
    }
    
    public static void main(String[] args) {
        BlankFinalVariable obj =new BlankFinalVariable();
        obj.print();
    }
}
