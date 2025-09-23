/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
     print this Pattern
     12345
     1234
     123
     12
     1

 */
public class Pattern7 
{
    public static void main(String[] args)
    {
       int n =5;
       for(int i=1;i<=n;i++)
       {
          for(int j=1;j<=n-i+1;j++)
          {
            System.out.print(j);
          }
          System.out.println();
       }
    }        
}
