/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q find the given array is in sorted order or not?
 * @author Administrator
 */
public class Problem10
{   
    public static boolean sortedCheaking(int[] arr,int idx)
    {
        if(idx == arr.length-1)
        {
           return true;
        }        
        if(arr[idx] < arr[idx+1])
        {
          return sortedCheaking(arr,idx+1);
        }
        else
        {
          return false;
        }    
    }        
    public static void main(String[] args)
    {
        int[] arr ={1,2,3,3};
        System.out.println(sortedCheaking(arr,0));
    }        
}
