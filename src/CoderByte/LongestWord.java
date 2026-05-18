/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoderByte;

/**
 * Have the function LongestWord(sen) take the sen parameter being passed and
 * return the largest word in the string. If there are two or more words that
 * are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 *
 * @author Nick Livens
 */
public class LongestWord 
{
    public static String LongestWord1(String sen)
    {
       String[] senAr = sen.split(" ");
       int longestLength = 0;
       String result = "";
       for(int i=0;i<senAr.length;i++)
       {
          if(senAr[i].length() > longestLength)
          {
             result = senAr[i];
             longestLength = senAr[i].length();
             
          }    
       }    
       return result;
    }        
    public static void main(String[] args)
    {
      String str = "fun&!! time456";
      String str1 = "i love dogs";
      String str2 = "mukund madhav keshav ved8888888888888";
      System.out.println(LongestWord1(str));
      System.out.println(LongestWord1(str1));
      System.out.println(LongestWord1(str2));
    }        
}
