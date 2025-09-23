/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
     print this pattern
     1
     2 3
     3 4 5
     6 7 8 9 10
     11 12 13 14
 */
public class Pattern8{
    
    public static void main(String[] args)
    {
       int n =5;
       int number = 1;
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=i;j++)
          {
             System.out.print(number+" ");
             number++;
          }    
          System.out.println();
       }    
    
    }        
    
}
