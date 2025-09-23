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
   public static void main(String[] args)
   {
       int arr[] = {100,40,20,10,30,50};
       
       for(int i = 0; i < arr.length-1;i++)
       {
           int min_val = i;
           for(int j =i+1; j < arr.length;j++)
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
       
       for(int i:arr)
       {
           System.out.println(i);
       }    
   }        
}
