/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;

/**
 * sort the given array of string using bubble sort algorithum
 * 
 * Input :- {"coding","is","fun"};
 * output : - {"coding","fun","is"};
 * 
 * @author c068
 */
public class PWAssignmentQ1 
{
  static void rearrenger(String[] arr)
  {
     int n = arr.length;
     for(int i=0;i<n-1;i++)
     {
         for(int j=0;j<n-i-1;j++)
         {
           if(arr[j].compareTo(arr[j+1]) > 0)
           {
             String temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
           }    
         }    
     }    
  }        
  public static void main(String[] args)
  {
     String[] arr = {"coding","is","fun"};
     String[] arr1 = {"string","two","is","this"};
     rearrenger(arr);
     for(String val : arr)
     {
         System.out.print(val+" ");
     }    
     System.out.println();
  }        
}
