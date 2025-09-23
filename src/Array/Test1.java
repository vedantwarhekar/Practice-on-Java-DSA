/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class Test1 
{   
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Entre the size of array");
      int size1 = sc.nextInt();
      int[] arr1 = new int[size1];
      for(int i=0;i<=arr1.length-1;i++)
      {
         arr1[i] = sc.nextInt();
      }   
      System.out.println("///////////////////////////////////////////////");
       System.out.println("Entre the size of array");
      int size2 = sc.nextInt();
      int[] arr2 = new int[size2];
      for(int i=0;i<=arr2.length-1;i++)
      {
         arr2[i] = sc.nextInt();
      }  
       
      
      int[] sum = new int[size1 > size2 ? size1:size2];
      int c =0;
      
      int i = arr1.length-1;
      int j = arr2.length-1;
      int k = sum.length-1;
      
      while(k >= 0)
      {
         int d = c;
         if(i >= 0)
         {
           d += arr1[i];
         }
         if(j >= 0)
         {
            d += arr2[j];
         }    
      
         c = d/10;
         d = d%10;
         
         sum[k] = d;
         
         i--;
         j--;
         k--;
      }     
      for(int val : sum)
      {
         System.out.println(val);
      }    
    }   
}
