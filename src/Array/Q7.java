/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 * Take an array of numbers as input and check if it is an array sorted in
   ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
     {3, 4, 6, 2} is not sorted in ascending order.
 * 
 * @author Administrator
 */
public class Q7 
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
      System.out.println("Entre the size for array :- ");
      int size = sc.nextInt();
      
      int[] number = new int[size];
      
      for(int i=0;i<size;i++)
      {
        number[i] = sc.nextInt();
      }
     
     boolean isAssending = true;
     
     for(int i=0;i<number.length-1;i++)
     {    
        if(number[i] > number[i+1])
        {
            isAssending = false;
            break;
        }   
     }
     
     if(isAssending){
        System.out.println("the array is sorted in assending order");
     }else{
       System.out.println("the array is not sorted in the assending order");
     }

    }        
}
