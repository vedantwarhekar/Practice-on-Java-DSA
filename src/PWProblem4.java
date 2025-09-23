/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * // return that number which repiting 2 time in array
 * @author Administrator
 */
public class PWProblem4 
{
   public static void main(String[] args)
   {
     int[] arr = {25,44,89,78,23,25};
     for(int i=0;i<arr.length;i++)
     {
       for(int j=i+1;j<arr.length;j++)
       {
         if(arr[i] == arr[j])
         {
           System.out.println(arr[i]);
           return;
         }    
       }
     }    
   }        
}
