/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;


/**
 * check if we can partition the array into two subarrays with equal sum .More
 * formally ,check that the prefix sum of a part of the array is equal to the suffix 
 * sum of reset of the array ....
 * @author c068
 */
public class PWProblem16 
{
    static int totalSum(int[] arr)
    {
       int totalsum = 0;
       for(int i=0;i<arr.length;i++)
       {
           totalsum += arr[i];
       }   
       return totalsum;
    } 
    static boolean equalSumPartition(int[] arr)
    {
       int totalsum = totalSum(arr);
       int prefixSum = 0;
       for(int i=0;i<arr.length;i++)
       {
          prefixSum += arr[i];
          int sufixSum = totalsum - prefixSum;
          if(prefixSum == sufixSum)
          {
            return true;
          }    
       }
       return false;
    }        
    public static void main(String[] args)
    {
       int arr[] = {5,3,2,6,3,1};
       
       boolean isequal = equalSumPartition(arr);
       System.out.println(isequal);
    }        
}
