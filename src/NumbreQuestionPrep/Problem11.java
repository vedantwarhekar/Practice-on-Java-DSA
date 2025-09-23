/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Problem11 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Entre the value of x-axis :- ");
      int x = sc.nextInt();
      System.out.println("Entre the value of y-axis :- ");
      int y = sc.nextInt();
      
      if(x>0 && y >0)
      {
        System.out.println("the entred numbre belongs from Quardent 1");
      }
      else if(x<0 && y>0)
      {
        System.out.println("the entred numbre belongs from Quardents 2");
      }
      else if(x<0 && y<0)
      {
        System.out.println("the entred numbre belong from quardent 3");
      }
      else if(x>0 && y<0)
      {
         System.out.println("the entred numbre belong from quardent 4");
      }
      else if (x == 0 && y == 0)
        System.out.println("Origin");
            
      else if (y==0 && x!=0)
        System.out.println("x-axis");
            
      else if (x==0 && y!=0)
        System.out.println("y-axis");
   }
}
