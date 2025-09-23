/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;

/**
 *
 * @author Administrator
 */
public class SelectionSort 
{
  public static void printarray(int arr[])
  {
     for(int i=0;i<arr.length;i++)
     {
        System.out.print(arr[i]+" ");
     }    
  }
  static void selectionSort(int[] arr)
  {
     int n = arr.length;
     for(int i=0;i<n-1;i++)
     {
        int min_val =i;
        for(int j=i+1;j<n;j++)
        {
           if(arr[min_val] > arr[j])
           {
             min_val = j; 
           }    
        } 
        int temp = arr[i];
        arr[i] = arr[min_val];
        arr[min_val] = temp;
     }    
  }        
  public static void main(String[] args)
  {
        int[] arr = {4, 1, 3, 5, 2};
        selectionSort(arr);
        printarray(arr);
  }
}
