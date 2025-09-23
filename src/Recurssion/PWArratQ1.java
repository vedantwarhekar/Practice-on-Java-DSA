/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * print all the element of array using recurssion.
 * @author c068
 */
public class PWArratQ1
{
   static void printArray(int[] arr,int idx)
   {
      if(idx == arr.length)
      {
         return;
      }
      System.out.println(arr[idx]);
      printArray(arr,idx+1);
   }        
   public static void main(String[] args)
   {
     int[] arr = {10,87,88,99,66,31};
     printArray(arr,0);
   }        
}
