/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Q9 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     
     for(int i=0;i<=arr.length-1;i++)
     {
       arr[i] = sc.nextInt();
     }
     int max =arr[0];
     for(int i=1;i<arr.length;i++)
     {
       if(arr[i] > max)
       {
         max = arr[i];
       }    
     }     
     for(int floor =max;floor >= 1;floor--)
     {
       for(int i=0;i<arr.length;i++)
       {
          if(arr[i] >= floor)
          {
             System.out.print("*\t");
          }else{
              System.out.print("\t");
          }    
       }
       System.out.println();
     }    
   }
}
