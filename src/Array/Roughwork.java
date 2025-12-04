/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Roughwork
{
   public static void main(String[] args)
   {
       int[] arr = {1,2,3,4,5,6,7,8,10};
       int target = 6;
       for(int i = 0; i < arr.length; i++)
       {
          if(arr[i] != i+1)
          {
              System.out.println("Missing Numbre is:- "+ (i+1));
          }
       }
   }

}
