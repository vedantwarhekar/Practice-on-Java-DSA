/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
     print the below pattern
     1
     0 1
     1 0 1
     0 1 0 1
     1 0 1 0 1 
**/
public class Pattern9
{
   public static void main(String[] args)
   {
      int n =5;
      int sum;
      for(int i=1;i<=5;i++)
      {
         for(int j=1;j<=i;j++)
         {
           sum = i+j;
           if(sum %2==0)
           {
             System.out.print(1);
           }
           else
           {
             System.out.print(0);
           }    
         }
        System.out.println();
      }    
   }        
}
