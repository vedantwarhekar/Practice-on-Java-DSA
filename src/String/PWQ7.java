/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 * the string should be compressed such that consecutive
 * duplicates of characters are replaced with the character
 * and followed by the number of consecutive duplicates.
 * 
 * input - aaabbbccddde
 * output - a3b3c2d3e
 * @author Administrator
 */
public class PWQ7 
{
   public static void main(String[] args)
   {
      String str = "aaabbbccdddeeeerrr";
      // u can not assign chracter to string thats why we need to add empty ""; 
      String ans = ""+str.charAt(0);
      int count = 1;
      for(int i=1;i<str.length();i++)
      {
         char ch = str.charAt(i);
         char prev = str.charAt(i-1);
         if(ch==prev)
         {
            count++;
         }
         else
         {
            if(count>1)ans+=count;
            count = 1;
            ans+= ch;
         }    
      }
      if(count>1)ans += count;
      System.out.println(ans);
   }        
}
