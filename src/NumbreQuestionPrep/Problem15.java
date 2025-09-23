/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;
import java.util.Scanner;
/**
 * Can a number be expressed as a sum of two prime numbers 
 * @author Administrator
 */
public class Problem15
{
   static int isPrime(int n)
   {
     int i,isPrime =1;
     for(int div=2;div*div <=n;div++)
     {
       if(n%div==0)
       {
         isPrime = 0;
         break;
       }    
     } 
     return isPrime;
   }        
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre a numbre :- ");
      int num = sc.nextInt();
      int flag = 0;
      for(int i=2;i*i<=num;i++)
      {
         if(isPrime(i) == 1)
         {
           if(isPrime(num-i)== 1)
           {
              System.out.println(num+" can be expressed as the sum of "+i+" and "+(num-i));   
              flag = 1;
           }    
         }    
      }
      if(flag == 0)
      {
        System.out.println("the given numbre is a prime thats why i am not able to do");
      }    
   }        
}
