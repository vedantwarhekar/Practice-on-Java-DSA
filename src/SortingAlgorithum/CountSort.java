/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;
import static SortingAlgorithum.BubbleSort.printArray;
/**
 *
 * @author c068
 */
public class CountSort {
    
    static int max(int[] arr)
    {
       int max = Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i] > max)
         {
            max = arr[i];
         }    
       }
       return max;
    } 
    // this is not a inplace algorithum.
    static void basicCountSort(int[] arr)
    {
       int max = max(arr);
       int[] frequancy_arr = new int[max+1];
       for(int i=0;i<arr.length;i++)
       {
           frequancy_arr[arr[i]]++;
       } 
       int k=0;
       for(int i=0;i<frequancy_arr.length;i++)
       {
          for(int j=0;j<frequancy_arr[i];j++)
          {
             arr[k++] = i;
          }    
       }    
    }
    static void countSort(int[] arr)// second and standarise count sort 
    {
        int max = max(arr);// find maximum
        int[] output = new int[arr.length];
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++)
        {
          count[arr[i]]++; // creation of frequancy array
        }
        for(int i=1;i<count.length;i++)
        {
          count[i] += count[i-1];// cration of prefixsum array
        }
        for(int i = arr.length-1;i>=0;i--)
        {
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }    
        for(int i=0;i<arr.length;i++)
        {
           arr[i] = output[i];
        }    
    }        
    public static void main(String[] args) {
     int[] arr = {5,3,2,6,7,2,1,7};
     //basicCountSort(arr);
     countSort(arr);
     printArray(arr);
    }
}
