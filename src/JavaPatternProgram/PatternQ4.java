/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
 *     unique pattern please learn from output	
 * @author Administrator
 */
public class PatternQ4
{
   
    public static void main(String[] args)
    {
       int num =5;
       int space =1;
       int star =num/2+1;
       for(int i=1;i<=num;i++)
       {
          for(int j=1;j<=star;j++)
          {
            System.out.print("*\t");
          }
          for(int j=1;j<=space;j++)
          {
            System.out.print("\t");
          }    
          for(int j=1;j<=star;j++)
          {
           System.out.print("*\t");
          }
          if(i<=num/2)
          {
             space+=2;
             star--;
          }else{
              space-=2;
              star++;
              }
          System.out.println();
        }    
               
    }    
}
