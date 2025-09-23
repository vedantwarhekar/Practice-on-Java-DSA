/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q Recursive Program to find Largest Element of the array in Java
 * @author Administrator
 */
public class PrepQ3
{
  static int[] arr = {55,88,2,15,45,63,89,62};
  static int max = arr[0];
  static int i = 1;
  public static void main(String[] args)
  {
     System.out.println("the largest element in array is :- "+largest());
  }
  static int largest()
  {
    if(i==arr.length)
    {
      return max;
    }
   if(max<arr[i])
   {
     max = arr[i];
   }
   i++;
   return largest();
  }        
}
