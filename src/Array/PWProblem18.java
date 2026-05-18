/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.HashMap;
import java.util.Scanner;

/**
 *   Q2 - Given an array of size n, find the total number of occurrences 
 *     of given number x.
 * 
 * @author Administrator
 */
public class PWProblem18 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int[] arr = {26,10,26,10,26};
      int num = sc.nextInt();
       HashMap<Integer,Integer> map = new HashMap<>();
//      int count = 0;
//      for(int i=0;i<arr.length;i++)
//      {
//
//          if(arr[i] == num)
//          {
//             count++;
//          }
//
//      }
       for(int i =0; i < arr.length; i++){
           map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }

      System.out.println(map.get(num));
   }        
}
