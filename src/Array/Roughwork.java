/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//rotate the given array 'a' by k step where k is non-negative integer
public class Roughwork
{
    static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args)
   {
       int[] arr = {1, 0, 1, 0, 1, 0};
       int start = 0; int end = arr.length-1;
       while (start < end){
           if(arr[start] == 1 && arr[end] == 0){
               swap(arr,start,end);
               start++;
               end--;
           }else if(arr[start] == 0){
               start++;
           }else if(arr[end] == 1){
               end--;
           }
       }
       for (int m : arr) {
           System.out.print(m + " ");
       }
       System.out.println();
   }

}
