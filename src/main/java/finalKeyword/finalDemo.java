/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalKeyword;

/**
 *
 * @author DELL
 */
public class finalDemo {
    final String NAME="mhi";
    int age=25;
    void print(){
    
        System.out.println("NAME  ="+NAME);
        System.out.println("age  ="  +age);
    }
    
    public static void main(String[] args) {
        finalDemo obj =new finalDemo();
        obj.print();
    }
}
