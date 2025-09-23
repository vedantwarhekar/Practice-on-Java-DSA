/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 * Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n. The 
 * task is to find union between these two arrays and print the number of elements of 
 * the union set.Union of the two arrays can be defined as the set containing distinct
 * elements from both the arrays. If there are repetitions, then only one occurrence 
 * of element should be printed in the union.
 * 
 * @author Administrator
 */
public class PWProblemA1
{
   public static void main(String[] args)
   {
      int[] arr ={1,2,3,4,5,6};
      int[] arr1 = {1,2,3};
      
      boolean check = true;
      for(int i=0;i<arr1.length;i++)
      {
         for(int j=0;j<arr.length;j++)
         {
            if(arr[j]==arr[i])
            {
               check = false;
               break;
            }    
         }
         if(!check){
            System.out.print(arr[i]);
         }
      }    
   }        
}
