/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Factorial {
 int factorialCalCulate(int n){
  if(n==1){
  return 1;
  }else
     return n=n*factorialCalCulate(n-1);
  
 }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any int number :");
        int UserInput=input.nextInt();
        Factorial ob=new Factorial();
       int res= ob.factorialCalCulate(UserInput);
        System.out.println(res);
    }
}
