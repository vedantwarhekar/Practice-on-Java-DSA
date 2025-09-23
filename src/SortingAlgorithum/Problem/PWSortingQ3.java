/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum.Problem;
import static SortingAlgorithum.BubbleSort.printArray;
/**
 * Given an array where all its elements are sorted in increasing order except
 * two swapped elements, sort it in linear time. Assume there are no duplicates
 * in the array. 
 * Input: A[] = [3, 8, 6, 7, 5, 9, 10] 
 * Output: A[] = [3, 5, 6, 7,8, 9, 10]
 * @author c068
 */
public class PWSortingQ3 {
    static void sortArr(int[] arr)
    {
      int n = arr.length;
      if(n<=1)
      {
        return;
      }    
      int x = -1,y=-1;
      for(int i=1;i<n;i++)
      {
        if(arr[i-1]>arr[i])
        {
          if(x == -1)
          {
            x = i-1;
            y = i;
          }else{
              y = i;
          }    
        }    
      } 
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
    }        
    public static void main(String[] args)
    {
      int[] arr = {3, 8, 6, 7, 5, 9, 10};
      sortArr(arr);
      printArray(arr);
      System.out.println();
    }           
}
