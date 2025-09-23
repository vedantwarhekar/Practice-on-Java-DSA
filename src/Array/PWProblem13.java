/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 * given an integer array 'a' return the prefix sum / running sum of array
 * @author Administrator
 */
public class PWProblem13 {
    
    public static int[] prefixArray(int[] arr)
    {
       int n = arr.length;
       int[] prefix = new int[n];
       prefix[0] = arr[0];
       for(int i=1;i<n;i++)
       {
         prefix[i] = arr[i] + prefix[i-1];
       }    
       return prefix;
    }        
    public static void main(String[] args)
    {
         int arr[] = {2,1,3,4,5};
         
         int[] prefix =   prefixArray(arr);
         
         for(int a : prefix)
         {
           System.out.print(a);
         }    
    }        

}

