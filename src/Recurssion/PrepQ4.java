/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q Recursive Program to find smallest Element of the array in Java
 * @author Administrator
 */
public class PrepQ4
{
    static int arr[] = {56,87,54,62,8,841,85};
    static int min = arr[0];
    static int i = 1;
    public static void main(String[] args)
    {
       System.out.println("the given samllest element in array is :- "+smallest());
    }
    static int smallest()
    {
       if(i == arr.length)
       {
          return min;
       } 
       if(min>arr[i])
       {
         min = arr[i];
       }
       i++;
       return smallest(); 
    }        
}
