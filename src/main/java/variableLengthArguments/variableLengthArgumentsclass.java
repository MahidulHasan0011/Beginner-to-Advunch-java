/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package variableLengthArguments;

/**
 *
 * @author DELL
 */
public class variableLengthArgumentsclass {
   
    void add(int ... num){
         int sum=0 ;
        for(int x:num){
         sum=sum+x;   
        }
        System.out.println(sum);
    }
}
