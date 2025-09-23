/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
            print this pattern
            ****
            ***
            **
            * 

 */
public class Pattern4
{
   public static void main(String[] args)
   {
      int n =4;
      int m =5;
      
      for(int i=n;i>=1;i--)
      {
         for(int j=1;j<=i;j++)
         {
           System.out.print("*");
         }    
         System.out.println();
      }    
   
   }        
}
