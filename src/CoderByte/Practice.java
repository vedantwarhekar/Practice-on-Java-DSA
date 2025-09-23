/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoderByte;

/**
 *
 * @author c068
 */
public class Practice{
   
    static int countChar(String str)
    {
      int count = 0;
      for(int i = 0; i < str.length(); i++)
      {
         if(str.charAt(i) != ' ')
         {
             count++;
         }     
      }    
      return count;
    }    
    public static void main(String[] args)
    {
       String str ="Vedant Warhekar      ";
       int total_char = countChar(str);
       System.out.println(total_char);
       
    }        
}