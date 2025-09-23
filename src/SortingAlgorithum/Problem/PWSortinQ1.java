/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortingAlgorithum;

/**
 * press all the zero to the end from given array without changing the
 * order of non-zero element
 * Input :- 405060;
 * output :- 456000;
 * logic :- use bubble sort algorithum
 * @author c068
 */
public class PWSortinQ1 
{
    static void arranger(int[] arr)
    {
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
           boolean flag = false; 
           for(int j=0;j<n-1-i;j++)
           {
              if(arr[j] == 0 && arr[j+1] != 0)
              {
                 int temp = arr[j+1];
                 arr[j+1] = arr[j];
                 arr[j] = temp;
                 flag = true;
              } 
              
           } 
           if(!flag) return;
        }    
    }        
    public static void main(String[] args)
    {
        int[] arr = {1, 0, 0, 5, 6, 0};
        arranger(arr);
        for(int val : arr){
            System.out.print(val + " ");
        }
    }        
}
