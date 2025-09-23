/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;
// write a java program to calculate sum of digit of number
/**
 *
 * @author Administrator
 */
public class PWQ5 
{
   static int sumOfDigit(int n)
   {
       if( n>=0 && n <= 9)
       {
          return n;
       }
       return sumOfDigit(n/10)+n%10;
   }        
   public static void main(String[] args)
   {
       System.out.println(sumOfDigit(1234));
   }        
}
