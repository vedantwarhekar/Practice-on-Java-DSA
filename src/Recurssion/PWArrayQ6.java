/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * given an array of integers print sums of all subsets in it. 
 * @author c068
 */
public class PWArrayQ6
{
   static void subsetSum(int[] arr,int n,int idx,int sum)
   {
      if(idx >= n)
      {
        System.out.println(sum);
        return;
      }
      subsetSum(arr,n,idx+1,sum+arr[idx]);
      subsetSum(arr,n,idx+1,sum);
   }        
   public static void main(String[] args)
   {
     int[] arr = {2,4,5};
     subsetSum(arr,arr.length,0,0);
   }        
}
