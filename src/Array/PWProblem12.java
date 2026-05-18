/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
/**
 * given an integers it may be positive and negative arrange this array by
 * the square of all integers placed in assending order.
 * @author Administrator
 */
public class PWProblem12
{
   static int[] findSquareRoot(int[] arr)
   {
      int n = arr.length;
      int left = 0;
      int right = n-1;
      int[] ans = new int[n];
      int k = n-1;
      while(left <= right)
      {
         if(Math.abs(arr[left]) > Math.abs(arr[right]))
         {
             ans[k--] = arr[left]*arr[left];
             left++;
         }else{
            ans[k--] = arr[right]*arr[right];
            right--;
         }    
      }
     return ans; 
   }        
   public static void main(String[] args)
   {
     int[] arr = {-10,-3,-2,1,4,5};
     int[] ans = findSquareRoot(arr);
     for(int a : ans)
     {
         System.out.print(a+"-");
     }    
   }        
}
