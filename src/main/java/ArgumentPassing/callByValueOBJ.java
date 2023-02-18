/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArgumentPassing;

/**
 *
 * @author DELL
 */
public class callByValueOBJ {
    public static void main(String[] args) {
        callByValueClass ob =new callByValueClass();
        int x=20;
        System.out.println("X before call "+x);
        ob.change(x);
        System.out.println("X after call "+x);
    }
}
