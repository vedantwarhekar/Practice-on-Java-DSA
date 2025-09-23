/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
            *****
            *   *
            *   *
            ***** 
 */
public class Pattern2
{
    public static void main(String[] args)
    {
       int n = 4;
       int m =5;
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=m;j++)
          {
             if(i==1 || j==1 || i==n || j==m)
             {
                System.out.print('*');
             }
             else
             {
               System.out.print(" ");
             }
          }
          System.out.println();
       }    
    }        
}
