/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;
import java.util.Scanner;
/**
 *
 * Q3 Find all the Prime Numbers in a Given Interval in Java
 * @author Administrator
 */
public class PrepQ3 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int num2 = sc.nextInt();
      for(int i = number;i<num2;i++)
      {
        if(isprime(i))
        {
           System.out.println(i);
        }    
      }    
    }
   public static boolean isprime(int num)
   {
     boolean flag = true;
     if(num<2)
        flag = false;
     else
     {
        for(int i=2;i<num;i++)
        {
           if(num %i == 0)
           {
             flag = false;
             break;
           }    
        }    
     
     }
     return flag;
   }        
}
