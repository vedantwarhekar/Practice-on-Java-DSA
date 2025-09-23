/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaPatternProgram;

/**
 *        *
 *      * * *
 *     * * * *
 *      * * * 
 *        *
 * @author Administrator
 */
public class PatternQ3
{
    public static void main(String[] args)
    {
       int num =5;
       int space = num/2;
       int star =1;
       for(int i=1;i<=num;i++)
       {
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
             space--;
             star+=2;
          }else{
              space++;
              star-=2;
              }
          System.out.println();
        }    
               
    }        
}
