/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 * Q count span in an array 
 * note span = max_num-min_num;
 * @author Administrator
 */
public class Q8Array 
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
     
     int max = arr[0];
     int min = arr[0];
     
     for(int i=1;i<arr.length;i++)
     {
        if(arr[i]> max)
        {
           max = arr[i];
        }
        if(arr[i]< min)
        {
           min = arr[i];
        }
     }
     
     int span = max-min;
     System.out.println(span);
   }        
}
