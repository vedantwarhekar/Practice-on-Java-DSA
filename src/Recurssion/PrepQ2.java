/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q Prime Number using Recursion in Java
 * .
 * @author Administrator
 */
public class PrepQ2
{
   static int i = 2;
   public static void main(String[] args)
   {
      int num = 6;
      if(isPrime(num))
          System.out.println("the given numbrer is prime");
      else
          System.out.println("the given numbre is not prime");
   }
   static boolean isPrime(int num)
   {
     // this is base condition
     if(i==num/2+1)
     {
       return true;
     }    
     if(num<=2)
     {
       return num == 2 ? true : false ;
     }    
     if(num%i ==0)
     {
       return false;
     }
     i++;
     return isPrime(num);
   }         
}
