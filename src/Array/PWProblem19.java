/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *  Q3 - Given an array arr[] of size N-1 with integers in the range of [1, N],
 *  the task is to find the missing number from the first N integers. 
 *   There are no duplicates in the list
 * 
 * @author Administrator
 */
public class PWProblem19 
{
     public static void main(String[] args)
     {
        int[] arr = {1,2,3,4,5,6,7,8,10};
        
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]!=i+1)
           {
              System.out.println(i+1);
              break;
           }    
        }    
     }        
}
