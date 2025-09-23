/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *  Given an integer array nums, find the 
   subarray with the largest sum, and return its sum.
 * @author Administrator
 */
public class Q5 
{  
   public static void findSubArray(int arr[],int n)
   {  
      int subarr = 0;
      for(int i=0;i<n;i++)
      {
         int current = arr[i];
         
         for(int j=i+1;j<n;j++)
         {
           current +=arr[j];
           if(current > subarr)
           {
              subarr = current;
           }    
         }
      }   
      System.out.println(subarr);
    }        
   public static void main(String[] args)
   {
     int[] arr ={ -2, -3, 4, -1, -2, 1, 5, -3 };
     int n = arr.length;
    findSubArray(arr,n);
    
     int[] arr2 ={5,4,-1,7,8};
     int n2 = arr2.length;
    findSubArray(arr2,n2);
   
   }        
}
