/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 * Given an array of integers arr[] of size N and an integer, the task is to rotate the array elements to the left by d positions.
   Examples: 
 * Input: arr[] = {1, 2, 3, 4, 5, 6, 7}, d = 2 
 * Output: 3 4 5 6 7 1 2
 *
 * Input: arr[] = {3, 4, 5, 6, 7, 1, 2}, d=2 
 * Output: 5 6 7 1 2 3 4
 * @author c068
 */
public class PWProblem9 {
   public static void main(String[] args)
   {
      int arr[] = {1, 2, 3, 4, 5, 6, 7};
      int n = arr.length;
      int[] ans = new int[n];
      int idx = 0;
      int k = 2;
      k = k%n;
      for(int i=k; i<n ; i++)
      {
         ans[idx++] = arr[i];
      }
      for(int i=0;i<k;i++)
      {
         ans[idx++] = arr[i];
      }  
      for(int i : ans)
      {
        System.out.print(i+" ");
      } 
      System.out.println();
   }        
}
