/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 * Q print a matrix in spiral order
 * @author Administrator
 */
public class Q2darr3
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      
        int row = sc.nextInt();
        int column = sc.nextInt();
         System.out.println("-----------------");
        int[][] arr = new int[row][column];
        
        for(int i=0;i<arr.length;i++)
        {
           for(int j=0;j<arr[0].length;j++)
           {
              arr[i][j] = sc.nextInt();
           }    
        }
        int min_row =0;
        int min_column = 0;
        
        int max_row = arr.length-1;
        int max_column = arr[0].length-1; 
        
        int total_Element = row*column;
        int count = 0;
        System.out.println("-----------------");
        while(count<total_Element)
        {
          // left wall
            for(int i=min_row,j=min_column;i<=max_row  && count<total_Element;i++)
            {
              System.out.println(arr[i][j]);
              count++;
            }
            min_column++;
          // bottom wall
          for(int i=max_row,j=min_column;j<=max_column && count<total_Element;j++)
          {
             System.out.println(arr[i][j]);  
             count++;
          }
          max_row--;
          //right wall
          for(int i=max_row,j=max_column;i>=min_row && count<total_Element;i--)
          {
             System.out.println(arr[i][j]);
             count++;
          }
          max_column--;
          // top wall 
          for(int i=min_row,j=max_column;j>=min_column && count<total_Element;j--)
          {
            System.out.println(arr[i][j]);
            count++;
          }
          min_row++;
        }
    }        
}
