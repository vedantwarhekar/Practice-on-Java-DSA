/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * // print sum of value in the array
 * @author c068
 */
public class PWArrayQ3
{
    static int sumOfArray(int[] arr,int idx)
    {
       int sum = 0;
       if(idx == arr.length)
       {
         return 0;
       }
       int ans = sumOfArray(arr,idx+1);
       return ans + arr[idx];
    }        
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 4, 2, 7, 5, 6, 8, 2, 4, 0};
        System.out.println(sumOfArray(arr,0));
    }
}
