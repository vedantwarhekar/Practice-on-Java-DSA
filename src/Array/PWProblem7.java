/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 * rotate the given array 'a' by k step where k is non-negative integer 
 * @author Administrator
 */
public class PWProblem7
{
   static int[] rotateArray(int[] arr,int k)
   {
     int n = arr.length;
     k = k%n;
     int [] ans = new int[n];
     int j = 0;
     for(int i= n-k;i<n;i++)
     {
       ans[j++] = arr[i];
     }
     for(int i=0;i<n-k;i++)
     {
        ans[j++] = arr[i];
     }
     return ans;
   }        
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[5];
      System.out.println("entre the value of k:- ");
      int k = sc.nextInt();
      for(int i =0;i<arr.length;i++)
      {
         arr[i] = sc.nextInt();
      }
      int[] ans = rotateArray(arr,k);
      for(int i=0;i<arr.length;i++)
      {
         System.out.print(ans[i]);
      }    
   }        
}
