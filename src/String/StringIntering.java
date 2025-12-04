/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Administrator
 */
public class  StringIntering
{
   public static void main(String[] args)
   {
      String str1 = "hello";
      // we are not able to change the character of the string
      // for me if i need to change hello to mello than i need to do is 
      str1 = "m" + str1.substring(1);
      System.out.println(str1);
   }         
}
