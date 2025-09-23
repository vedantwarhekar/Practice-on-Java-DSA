/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
          print this pattern
                   *
                  **
                 ***
                ****
*/
public class Pattern5
{
    public static void main(String[] args)
    {
       int n =4;
       for(int i=1;i<=n;i++)
       {
         for(int j=1;j<=n-i;j++)
         {
            System.out.print(" ");
         }
         for(int j=1;j<=i;j++)
         {
           System.out.print("*");
         } 
         System.out.println();
       
       }    
    }        
}
