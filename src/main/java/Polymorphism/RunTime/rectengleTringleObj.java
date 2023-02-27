/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism.RunTime;

/**
 *
 * @author DELL
 */
public class rectengleTringleObj {
    public static void main(String[] args) {
        
//        Shape[]s=new Shape[3]; //creat and declear array
//        
//         s[0] =new Shape();
//         s[1] =new ractengle(10.0,20.0);  
//         s[2]=new tringle(20.0,30.0);
//         
//         for(int i=0;i<3;i++){
//          System.out.println(s[i].area());
//         }

        Shape [] s=new Shape[3];
        s[0]=new Shape();
        s[1]= new ractengle(10,20);
        s[2]=new tringle(20,10);
        for(int i=0;i<3;i++){
            System.out.println(s[i].area());
        }
        
    }
    
}
