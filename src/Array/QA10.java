/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 * Q sum of two array;
 * @author Administrator
 */
public class QA10
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Entre row of array :-");
      int row = sc.nextInt();
      System.out.print("Entre column of array :- ");
      int column = sc.nextInt();
      int[][] arr = new int[row][column];
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<column;j++)
          {
             arr[i][j] = sc.nextInt();
          }     
      } 
      System.out.println("Entre a number to find :- ");
      int num = sc.nextInt();
      for(int i=0;i<row;i++)
      {
          for(int j=0;j<column;j++)
          {
             if(num == arr[i][j])
             {
               System.out.println("sum found in row no "+i+" and column no "+j);
             }    
          }     
      }  
   }          
}
