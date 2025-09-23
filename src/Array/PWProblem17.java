/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 *  Q1 - Given an array sorted in increasing order of size n and an integer x, 
 * find if there exists a pair in the array whose absolute difference is exactly x.(n>1)
 * 
 * @author Administrator
 */
public class PWProblem17 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,10,15,20,26};
        int x = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[j]-arr[i]==x)
               {
                  System.out.println(arr[j]+"-"+arr[i]+" = yes");
                  break;
               }    
           }    
        }    
    }        
}
