/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;


public class BubbleSort
{
    public static void printArray(int arr[])
    {
           for(int i=0;i<arr.length;i++)
           {
               System.out.print(arr[i]+" ");
           }    
    }
     static void bubblesort(int[] arr)
     {
        int n = arr.length;
        for(int i=0;i < n-1;i++)
        {
           boolean flag = false;  
          for(int j=0;j<n-i-1;j++)
          {
            if(arr[j] > arr[j+1])
            {
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
              flag = true;
            }    
          }
          if(!flag)
          {
            return;
          }    
        }     
     }        
     public static void main(String[] args)
     {
         int[] arr = {5,7,8,1,2,34};
         bubblesort(arr);
         printArray(arr);
     }        
}
