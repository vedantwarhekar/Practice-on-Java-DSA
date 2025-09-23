/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
   Given an array arr[] of non-negative integers and an integer sum
   * , find a subarray that adds to a given sum.
 * @author Administrator
 */
public class Q4 
{  
   public static void subArray(int[] arr, int n,int sum)
   {
      for(int i=0;i<n;i++)
      {
        int current = arr[i];
        if(sum == current)
        {
          System.out.println("sum found at index "+i);
          return;
        }
        else
        {
          for(int j=i+1;j<n;j++)
          {
            current+=arr[j];
            if(current == sum)
            {
              System.out.println("sum found between "+i +" and "+j);
              return;
            }    
          }    
        }    
      }    
      System.out.println("atom not found");
      return;
   }         
   public static void main(String[] args)
   {
      int[] arr ={ 15, 2, 4, 8, 9, 5, 10, 23 };
      int sum = 23;
      int n = arr.length;
      subArray(arr,n,sum);
    }        
}
