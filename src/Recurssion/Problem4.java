/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 *
 * Q print fibonach of a given numbers
 */
public class Problem4
{
   public static void fabonache(int a,int b,int n)
   {
      if(n == 0)
      {
        return;
      }
     System.out.println(a);
     int c = a+b;
     a = b;
     b = c;
     fabonache(a,b,n-1);
    }        
   public static void main(String[] args)
   {
    fabonache(0,1,10);
             
   }        
}
