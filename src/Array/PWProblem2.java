/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 * // find the duplicates in the array and replace them with -1
 * @author Administrator
 */
public class PWProblem2 
{
    public static void main(String[] args)
    {
       int arr[] = {10,20,10,60,30};
       
       for(int i =0; i < arr.length;i++)
       {
          for(int j = i+1; j < arr.length; j++)
          {
              if(arr[i] == arr[j])
              {
                  arr[i] = -1;
                  arr[j] = -1;
              }    
          }    
       }
       for(int j : arr)
       {
           System.out.println(j);
       }    
    }        
}
