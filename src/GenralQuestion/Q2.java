/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;
import java.util.Scanner;
/**
 * Q identifiy the number is prime or not
 * @author Administrator
 */
public class Q2
{
       public static void main(String[] args)
       {
         Scanner sc = new Scanner(System.in);
         System.out.print("Entre a number:- ");
         int low = sc.nextInt();
         int high = sc.nextInt();
         
         for(int n=low;n<=high;n++)
         {
            int count =0;
            // try to divide n and increase count
            for(int div =2;div*div<=n;div++)
            {
               if(n%div ==0)
               {
                 count++;
                 break;
               }    
            }
            // try to increase count and divide n
            if(count==0)
            {
              System.out.println(n);
            }    
         }
         
       }        
}
