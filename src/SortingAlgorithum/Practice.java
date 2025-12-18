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
public class Practice 
{
    static void swap(int[] arr,int start,int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static  void merege(int[] arr, int start,int mid, int end)
    {
        int l1 = mid-start+1;
        int l2 = end - mid;
        int[] left = new int[l1];
        int[] right = new int[l2];
        int i,j,k;
        for(i = 0; i < l1; i++) left[i] = arr[start + i];
        for(j = 0; j < l2; j++) right[j] = arr[mid+1+j];
        i = 0;
        j = 0;
        k = start;
        while (i < l1 && j < l2)
        {
            if(left[i] < right[j])
            {
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while(i < l1)
        {
            arr[k++] = left[i++];
        }
        while(j < l2)
        {
            arr[k++] = right[j++];
        }

    }

    static void mergeSort(int[] arr, int start, int end){
          if(start >= end) return;
          int mid = start + (end-start)/2;
          mergeSort(arr,start,mid);
          mergeSort(arr,mid+1,end);
          merege(arr,start,mid,end);
    }
   public static void main(String[] args)
   {
       int arr[] ={4,1,3,5,3,2,4};
       int n = arr.length;
       mergeSort(arr,0,n-1);
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i] + " ");
       }
       System.out.println();
   }        
}
