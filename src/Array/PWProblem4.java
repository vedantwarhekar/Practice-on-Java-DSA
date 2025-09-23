/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
  Peak element is the one which is greater than its immediate left neighbor 
* and its immediate right neighbor.
  Leftmost and rightmost element cannot be a peak element.
 * @author Administrator
 */
public class PWProblem4 
{
   public static void main(String[] args)
   {
     int arr[] = {1, 1, 3, 4, 2, 3, 5, 7, 0};
     for(int i=1;i<arr.length-1;i++)
     {
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
        {
           System.out.println(arr[i]);
        }    
      }    
   }        
}
