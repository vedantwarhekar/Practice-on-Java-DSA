/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 * // identify the substring of the string palindrome or not and print tah
 * palindrome string
 * @author Administrator
 */
public class PWQ5 
{
   static boolean isPalindrome(String str)
   {
      int i =0;
      int j = str.length()-1;
      boolean flag = true;
      while(i<j)
      {
         if(str.charAt(i) != str.charAt(j))
         {
             flag = false;
             break;
         } 
         i++;
         j--;
         
      } 
      return flag;
   }        
   public static void main(String[] args)
   {
      String str = "abcd";
      int count = 0;
      for(int i=0;i<str.length();i++)
      {
        for(int j=i+1;j<=str.length();j++)
        {
          if(isPalindrome(str.substring(i,j)))
          {
             System.out.print(str.substring(i,j)+" ");
             count++;
          }        
        }    
      }
      System.out.println("the number of substring "+count);
   }        
}
