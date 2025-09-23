/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaraleSirQuestion;

/**
 *4. Sorting first half of array in Ascending order and second half in Descending order
 * @author c068
 */
public class Q4 {
    static void reverser(int[] arr,int str,int end)
    {
       for(int i = str;i <= end;i++)
       {
          for(int j = str;j <= end-i;j++)
          {
            if(arr[j] > arr[j+1])
            {
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }    
          }             
       }    
    }  
    static void reverser2(int[] arr,int str,int end)
    {
        
       for(int i = str;i < end-1;i++)
       {
          for(int j = str;j < end-1;j++)
          {
            if(arr[j] < arr[j+1])
            {
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1] = temp;
            }    
          }             
       }    
    } 
    public static void main(String[] args)
    {
      int arr[] = {30,5,20,68,77,70,2,1,10,85,88};
      int start = 0,end = arr.length;
      int mid = start+(end-start)/2;
      reverser(arr,0,mid-1);
      reverser2(arr,mid+1,end);
      for(int i : arr)
      {
         System.out.print(i+" ");
      }   
      System.out.println();
    }       
}
