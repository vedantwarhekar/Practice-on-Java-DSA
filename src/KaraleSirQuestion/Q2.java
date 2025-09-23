/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaraleSirQuestion;

/**
 * 2 - Write the code to find the Fibonacci series upto the nth term.
 * @author c068
 */
public class Q2 
{
   public static void main(String[] args)
   {
      int num = 20;
      int a = 0;
      int b = 1,c;
      while(num != 0)
      {
         System.out.print(a+" ");
         c = a + b;
         a = b;
         b = c;
         num--;
      }  
      System.out.println();
   }        
}
