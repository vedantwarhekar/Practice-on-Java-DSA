
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
/**
   1. Write a program to find the missing number in a given array
   
   Logic:- 
   *   first sort the array
   *   than apply the loop
   **/
import java.util.Arrays;

public class Q1 
{
   public static void main(String[] args)
   {
       int[] arr = {5,8,7,6,9,14,12,10};
       Arrays.sort(arr);
       // use hash set to store the element of array into them
       int min = arr[0];
       int max = arr[arr.length-1];
       for(int i=0;i<arr.length;i++)
       {
          if(i != arr[i])
          {
             System.out.println(i);
          }    
       }
   }        
}
