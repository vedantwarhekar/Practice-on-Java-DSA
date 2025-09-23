/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;
import static SortingAlgorithum.SelectionSort.printarray;
/**
 *
 * @author c068
 */
public class QuickSort 
{
    static void swap(int[] arr,int start,int end)
    {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
    }        
    static int partition(int[] arr,int st,int end)
    {
       int pivot = arr[st];
       int count = 0;
       for(int i=st+1;i<arr.length;i++)
       {
          if(pivot >= arr[i])
          {
            count++;
          }    
       }
       int pivotidx = st+count;
       swap(arr,st,pivotidx);
       int i = st,j = end;
       while(i < pivotidx && j > pivotidx)
       {
          while(arr[i]<= pivot)
          {
             i++;
          }
          while(arr[j] > pivot)
          {
             j--;
          } 
          if(i < pivotidx && j > pivotidx)
          {
             swap(arr,i,j);
             i++;
             j--;
                     
          }    
       }    
       return pivotidx;
    }        
    static void QuickSort(int[] arr,int st,int end)
    {
        if(st >= end)return;
        int partition = partition(arr,st,end);
        QuickSort(arr,st,partition-1);
        QuickSort(arr,partition+1,end);
    }        
    public static void main(String[] args)
    {
       int[] arr = {2,4,3,5,1};
       QuickSort(arr,0,arr.length-1);
       printarray(arr);
    }        
}

