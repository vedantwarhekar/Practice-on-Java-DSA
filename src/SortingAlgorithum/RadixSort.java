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
public class RadixSort 
{
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
    static void countSort(int[] arr,int place)
    {
       int[] output = new int[arr.length];
       int[] count = new int[10];
       for(int i=0;i<arr.length;i++)
       {
          count[(arr[i]/place)%10]++;
       }
       // make prefix sum array of count array
       for(int i=1;i<count.length;i++)
       {
          count[i]+=count[i-1];
       }    
       for(int i = arr.length-1;i >= 0;i--)
       {
         int idx = count[(arr[i]/place)%10]-1;
         output[idx] = arr[i];
         count[(arr[i]/place)%10]--;
       }
       for(int i=0;i<arr.length;i++)
       {
         arr[i] = output[i];
       }    
    }        
    static void radixSort(int[] arr)
    {
        int max = max(arr); //get maximum element
        for(int place = 1; max/place > 0;place*=10)
        {
           countSort(arr,place);
        }    
    }  
    public static void main(String[] args)
    {
       int[] arr = {170,40,75,90,802,2};
       radixSort(arr);
       printArray(arr);
    }        
}
