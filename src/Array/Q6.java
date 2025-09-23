/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 * 2nd way of finding the minimum and maximum from the given array
 * @author Administrator
 */
public class Q6 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre the size for array :- ");
      int size = sc.nextInt();
      
      int[] number = new int[size];
      
      for(int i=0;i<size;i++)
      {
        number[i] = sc.nextInt();
      }
      
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      
      for(int i=0;i<number.length;i++)
      {
         if(number[i]<min)
         {
           min = number[i];
         }
         else if(number[i]>max)
         {
           max = number[i];
         }    
      }    
     System.out.println("the minimum number is "+min);
     System.out.println("the maximum number is "+ max);
   }        
}
