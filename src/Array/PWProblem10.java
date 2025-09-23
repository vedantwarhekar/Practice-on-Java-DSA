/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 * // you has the array which is a combination of 00101001010
 * the task is place all zero stating position and all one at last position
 * 00000001111 like this.
 * @author Administrator
 */
public class PWProblem10 {
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<arr.length;i++)
     {
        arr[i] = sc.nextInt();
     }
     int count = 0;
     for(int i =0;i<arr.length;i++)
     {
        if(arr[i] == 0)
        {
           count++;
        }     
     }
      for(int i=0;i<arr.length;i++)
     {
        if(i < count)
        {
          arr[i] = 0;
        }else
        {
          arr[i] = 1;
        }    
     }
     for(int i=0;i<arr.length;i++)
     {
       System.out.print(arr[i]);
     }    
    }        
}
