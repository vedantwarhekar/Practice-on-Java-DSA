/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
              *****
             *****
            *****
           *****
          ***** 
 */
public class APatternQ11
{
   public static void main(String[] args)
   {
       int n=5;
       for(int i=1;i<=n;i++)
       {
          
          for(int j=1;j<=n-i;j++)
          {
             System.out.print(" ");
          }
          for(int j=1;j<=n;j++)
          {
              System.out.print("*");
          }
          System.out.println();
       }    
   }        
}
