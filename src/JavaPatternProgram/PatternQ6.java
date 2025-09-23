/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PatternQ6
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       
       for(int i=1;i<=num;i++)
       {
         for(int j=1;j<=num;j++)
         {
           if(i+j == num+1)
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
