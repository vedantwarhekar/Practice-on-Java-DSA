/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Arrays;
/**
 * Q1 - Given an unsorted array arr[] of size N having both negative and positive 
 * integers, place all negative elements at the end of array without changing the
 * order of positive elements and negative elements.
 * 
 * Input :
         N = 8

      arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }

      Output : 1 3 2 11 6 -1 -7 -5
 * @author Administrator
 */
public class PWProblem5 
{       
   public static void main(String[] args)
   {
      int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
      int[] ans = new int[arr.length];
      int idx = 0;
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i] >= 0)
        {
           ans[idx] = arr[i];
           idx++;
        }    
      }
      for(int i=0;i<arr.length;i++)
      {
        if(arr[i] <= 0)
        {
           ans[idx] = arr[i];
           idx++;
        }    
      }
      for(int i:ans)
      {
         System.out.print(i);
      } 
      System.out.println();
   }        
}
