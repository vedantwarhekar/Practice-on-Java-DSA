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
public class Qd2arr2
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Entre the row of array :- ");
      int row = sc.nextInt();
      System.out.print("Entre the columns of araay :- ");
      int columns = sc.nextInt();
      
      int[][] arr = new int[row][columns];
      
      for(int i=0;i<row;i++)
      {
         for(int j=0;j<columns;j++)
         {
           System.out.println("Entre the value of row and columns");
           arr[i][j] = sc.nextInt();
         }    
      }
      System.out.print("ente the number you want a find:- ");
      int x = sc.nextInt();
      for(int i=0;i<row;i++)
      {
        for(int j=0;j<columns;j++)
        {
           if(arr[i][j]== x)
           {
              System.out.println("the number is found at row number "+ i+" and column number "+j);
           }    
        }    
      }
       for(int i=0;i<row;i++)
      {
        for(int j=0;j<columns;j++)
        {
           System.out.print(arr[i][j]+" ");    
        }
        System.out.println();
      }    
   }        
}
