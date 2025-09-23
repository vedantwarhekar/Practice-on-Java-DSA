/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Arrays;

/**
 * Q2 - Given two arrays a[] and b[] of size n and m respectively where m >= n.
 * The task is to find 
 union between these two arrays and print the number of elements of the union set.
 Union of the two arrays can be defined as the set containing distinct elements from
 * both 
 the arrays. If there are repetitions, then only one occurrence of element should be
 * printed 
 in the union
 * @author Administrator
 */
public class PWProblem6 {
    
    public static void main(String[] args)
    {
      int a[] = {1, 2, 3, 4};
      int b[] = {3, 4, 5, 6, 7};
      int merge[] = new int[a.length + b.length];
      int ans[] = new int[a.length + b.length];
      
      // to merge two array
      int idx =0;
      for(int i =0; i< a.length; i++)
      {
          merge[idx] = a[i];
          idx++;
      }    
      for(int j = 0 ; j < b.length; j++)
      {
          merge[idx] = b[j];
          idx++;
      } 
     
      // to remove deuplicate element from array
      int uniqueCount = 0;
      for(int i = 0; i < merge.length;i++)
      {
          boolean isDuplicate = false;
          
          for(int j = 0; j < uniqueCount; j++)
          {
              if(merge[i] == ans[j])
              {
                 isDuplicate = true;
                 break;
              }      
          }   
          
           if(!isDuplicate)
           {
                  ans[uniqueCount] = merge[i];
                  uniqueCount++;
           }  
      }    
      
      // Copy unique elements to a new array of proper size
      int[] result = Arrays.copyOf(ans,uniqueCount);
      
      System.out.print(Arrays.toString(result) + " ");  
    } 
}        
    

