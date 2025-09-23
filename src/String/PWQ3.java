/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 * given a string the task is to toggle all character of the string
 *  i.e to convert upper case to lower case and vise versa;
 * using stringBuilder class;
 * @author Administrator
 */
public class PWQ3 
{
  public static void main(String[] args)
  {  
      StringBuilder str = new StringBuilder("VedANt");
      System.out.print(str +" -> ");
      for(int i=0;i<str.length();i++)
      {
          char ch = str.charAt(i);
          boolean flag = true; // cosider the char is uppercase
          int ascii = (int)ch;
          if(ch == ' ') continue;
          if(ascii >= 97) flag = false;
          if(flag == false)
          {
             ascii -= 32;
             char dh = (char)ascii;
             str.setCharAt(i, dh);
          } 
          else
          {
              ascii +=32;
              char dh = (char)ascii;
              str.setCharAt(i,dh);
          }    
      } 
      System.out.print(str);
      System.out.println();
  }        
}
