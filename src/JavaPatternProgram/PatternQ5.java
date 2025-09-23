/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
 *           *
 *              *
 *                 *
 *                    *
 *                       *
 * @author Administrator
 */
public class PatternQ5 {
     public static void main(String[] args)
    {
       int num =5;
       for(int i=1;i<=num;i++)
       {
          for(int j=1;j<=num;j++)
          {
             if(i==j)
             {
                System.out.print("*\t");
             }else{
                 System.out.print("\t");
             }    
          }
          System.out.println();
        }    
               
    }    
}
