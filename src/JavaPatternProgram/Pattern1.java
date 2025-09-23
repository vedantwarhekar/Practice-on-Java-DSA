/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
         print the below pattern
         *****
         *****
         *****
         *****
**/
public class Pattern1
{
   public static void main(String[] args)
   {
       int n = 4;
       int m = 5;
      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=m;j++)
          {
             System.out.print("*");
          }
          System.out.println();
      }
   }        
}
