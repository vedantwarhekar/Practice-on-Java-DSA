/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;

/**
 * print prime numbre from 1 to 100
 * @author Administrator
 */
public class Problem16 
{
   public static void main(String[] args)
   {
     for(int i=1;i<=100;i++)
     {
       if(isPrime(i))
       {
          System.out.println(i);
       } 
     }    
   }
   static boolean isPrime(int num)
   {
      if(num<2)
      {
        return false;
      }    
      for(int i=2;i<num/2;i++)
      {
        if(num%i==0)
        {
          return false;
        }    
      }    
     return true;
   }        
}
