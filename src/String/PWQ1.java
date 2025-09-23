/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *  print all the sub sequance of the given string
 * @author Administrator
 */
public class PWQ1
{
   public static void main(String[] args)
   {
      String str = "abcd";
      for(int i=0;i<str.length();i++)
      {
         for(int j=i;j<str.length()+1;j++)
         {
            System.out.print(str.substring(i,j)+" ");
         }    
      }
      System.out.println();
   }           
}
