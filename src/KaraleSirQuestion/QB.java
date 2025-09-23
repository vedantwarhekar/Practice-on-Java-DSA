/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaraleSirQuestion;
import java.util.Arrays;
import java.util.Collections;
/**
 * 14. How do you implement a binary search in Java?
 * @author c068
 */
public class QB {
    static void BinarySearch(int[] arr,int target)
    {
       int str = 0,end = arr.length-1;
       while(str <= end)
       {
         int mid = str+(end-str)/2;
         if(arr[mid] == target)
         {
             System.out.println("the target element found at index :- " +mid);
             return;
         } 
         else if(arr[mid] > target)
         {
           end = mid-1;
         }
         else
         {
            str = mid+1;
         }
       }    
       
    }        
    public static void main(String[] args)
    {
        int[]arr = {5,8,9,7,8,2,4};
        Arrays.sort(arr);
        for(int m : arr)
        {    
          System.out.print(m+" ");
        }
        System.out.println();
          BinarySearch(arr,8);
    }        
}
