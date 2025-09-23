/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 * given an array of integer of size n.Answer the q quries where you need to print the
 * sum of value in given range of indices from l to r.
 * Note :- the value of land r follows n based indexing means 1 based indexing
 * @author Administrator
 */
public class PWProblem15 
{
   static int[] prefixArray(int[] arr)
   {
     for(int i=1;i<arr.length;i++)
     {
       arr[i] = arr[i-1]+arr[i];
     }
     return arr;
   }        
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Entre the size of array :- ");
     int n = sc.nextInt();
     int[] arr = new int[n+1];
     for(int i=1;i<=n;i++)
     {
        System.out.print("Entre the element of array");
        arr[i] = sc.nextInt();
     }
     int[] prefix = prefixArray(arr);
     System.out.print("how many quries you want to ask :- ");
     int q = sc.nextInt();
     
     while(q-- > 0)
     {
       System.out.println("Entre Range");
       int l = sc.nextInt();
       int r = sc.nextInt();
       int ans = prefix[r] - prefix[l-1];
       System.out.println("sum :- "+ans);
     }    
   }        
}
