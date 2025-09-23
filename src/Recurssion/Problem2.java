/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 *
 * Q write a java program to print value 1 to 5
 */
public class Problem2
{
   public static void printVal(int n)
   {
      if(n==6)
      {
        return;
      }
      System.out.println(n);
      printVal(n+1);
   }        
           
   public static void main(String[] args)
   {
      int n=1;
      printVal(n);
   }
}
