/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
 *    * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * @author c068
 */
public class Pattern3 {
   public static void main(String[] args)
   {
     int numbre = 1;     
     for(int i=1;i<=5;i++)
     {   
              
          for(int j=1;j<=i;j++)
          {
             int num = i+j;
             if(num%2==0)
             {
               System.out.print(1+" ");
             }else
                 System.out.print(0+" ");
          }
              
          System.out.println();
     }  
   }         
}
