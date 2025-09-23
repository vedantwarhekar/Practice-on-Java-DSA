/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
                           1
                          212
                         32123
                        4321234
                       543212345 
       
      */
public class APatternQ13
{
   public static void main(String[] args)
   {
      int n=5;
      
      for(int i=1;i<=n;i++)
      {
          for(int j=0;j<=n-i;j++)
          {
              System.out.print(" ");
          }
          for(int j=i;j>=1;j--)
          {
             System.out.print(j);
          }
          for(int j=2;j<=i;j++)
          {
             System.out.print(j);
          }    
          System.out.println();
      
      }
    }        
}
