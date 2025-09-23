/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q write a java programm to reverse a numbre 
 * @author Administrator
 */
public class PrepQ5 
{
   static void reverse(int num)
   {
      if(num<10)
      {
        System.out.println(num);
        return;
      }else{
        System.out.print(num%10);
      }
      reverse(num/10);
   }        
   public static void main(String[] args)
   {
      int numbre = 456123;
      System.out.print("the reverse order of a numbre is :- ");
      reverse(numbre);
   }        
}
