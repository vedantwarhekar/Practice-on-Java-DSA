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
public class Qd2arr 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Entre the rows of Array :- ");
      int rows = sc.nextInt();
      System.out.print("Entre the couloms of Array :- ");
      int columns = sc.nextInt();
      int[][] arr = new int[rows][columns];
      
      for(int i=0;i<rows;i++)
      {
         for(int j=0;j<columns;j++)
         {
            arr[i][j] = sc.nextInt();
         }
      }
      
      for(int i=0;i<rows;i++)
      {
         for(int j=0;j<columns;j++)
         {
           System.out.print(arr[i][j]+" ");
         } 
         System.out.println();
      }    
      
   }        
}
