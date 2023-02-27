/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.thisKeyWord;

/**
 *
 * @author DELL
 */
public class methodClass {
  void message(){
      System.out.println("message methid");
      
  }
void display(){
    this.message();
    System.out.println("display methid");
}


    public static void main(String[] args) {
        methodClass obj =new methodClass();
        obj.display();
    }
}
