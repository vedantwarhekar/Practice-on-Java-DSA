/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 Given an array of integers arr[] of size N and an integer, the task is to rotate the 
 array elements to the left by d positions.
 Examples: 
 * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2 
 * Output: 3 4 5 6 7 1 2
 *
 * Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2 
 * Output: 5 6 7 1 2 3 4
 * @author Administrator
 */
public class Roughwork
{
        
        
   public static void main(String[] args)
   {
       int[] arr = {1,2,3,4,5};
       int k = 2;
       int[] ans = new int[arr.length];
       int idx = 0;
       
       for(int i = k; i < arr.length;i++)
       {
           ans[idx] = arr[i];
           idx++;
       }    
       for(int i = 0; i < k;i++)
       {
           ans[idx] = arr[i];
           idx++;
       }  
       
       for(int i : ans)
       {
           System.out.print(i +" ");
       }    
       System.out.println();
   }
}
