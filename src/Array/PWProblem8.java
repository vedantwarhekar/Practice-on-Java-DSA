/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 * rotate the given array without using extra space
 * i.e without creating new array
 * @author Administrator
 */
public class PWProblem8 
{
   static void swap(int start,int end,int[] arr)
   {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
   }        
   static void reverse(int start,int end,int[] arr)
   {
       while(start < end)
       {
          swap(start,end,arr);
          start++;
          end--;
       }
   } 
   
   static void rotateArray(int[] arr,int k)
   {
     int n = arr.length;
     k = k%n;  
     reverse(0,n-k-1,arr);
     reverse(n-k,n-1,arr);
     reverse(0,n-1,arr);
   }    
   
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      System.out.println("entre the value of k:- ");
      int k = sc.nextInt();
      for(int i =0;i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }
      rotateArray(arr,k);
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(arr[i]);
      }    
   }     
}
