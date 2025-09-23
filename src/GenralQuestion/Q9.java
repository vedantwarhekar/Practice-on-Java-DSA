/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;

import java.util.Scanner;

/**
 *Q print the possible prime factorization of a number
 * @author Administrator
 */
public class Q9 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Entre a number :- ");
     int num= sc.nextInt();
     
     
     for(int div=2;div*div<=num;div++)
     {
        while(num%div == 0)
        {
          num = num/div;
          System.out.println(div);
        }    
     }
     // special case if number is 46 than
     if(num!=1)
     {
       System.out.println(num);
     }    
     
   }        
}
