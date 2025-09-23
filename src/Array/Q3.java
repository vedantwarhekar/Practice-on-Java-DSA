/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
/**
 * write a java program to revers the element of the array
 * @author Administrator
 */
public class Q3 {
    public static void reverseArr(int start,int end,int[] arr){
          if(start >= end)
          {
            return;
          }
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          reverseArr(start+1,end-1,arr);
    }
    
    public static void main(String[] args)
    {
      int[] arr = {10,15,20,25};
      reverseArr(0,3,arr);
      
      for(int i=0;i<arr.length;i++)
      {    
        System.out.println(arr[i]);
      }  
    }        
    
}
