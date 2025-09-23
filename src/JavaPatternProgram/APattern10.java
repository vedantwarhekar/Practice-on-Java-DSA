/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
                    Draw this pattern
                    *      *
                    **    **
                    ***  ***
                    ********
                    ********
                    ***  ***
                    **    **
                    *      *
* 
 */
public class APattern10
{
    public static void main(String[] args)
    {
         int n =5;
 
         for(int i=1;i<=n;i++)
         {
             // upper half
             for(int j=1;j<=i;j++)
             {
                System.out.print("*");
             }
             int spaces = 2*(n-i);
             for(int j=1;j<=spaces;j++)
             {
                System.out.print(" ");
             }
             for(int j=1;j<=i;j++)
             {
                System.out.print("*");
             }    
                 
             System.out.println();
         
         } 
         // for lower
         for(int i=n;i>=1;i--)
         {
             // lower half
             for(int j=1;j<=i;j++)
             {
                System.out.print("*");
             }
             int spaces = 2*(n-i);
             for(int j=1;j<=spaces;j++)
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
