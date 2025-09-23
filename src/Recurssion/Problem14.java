/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;
import java.util.HashSet;
/**
 *  Q print all uniqe subsequance of a string "aaa"
 * @author Administrator
 */
public class Problem14
{
   public static void subSequance(String str,int idx,String new_string,HashSet<String> set)
   {
      if(idx == str.length())
      {
         if(set.contains(new_string))
             return;
         else
         {
          System.out.println(new_string);
          set.add(new_string);
          return;
         }
      }
      char current_Char = str.charAt(idx);
      
      //to be
      subSequance(str,idx+1,new_string+current_Char,set);
      
      // not to be
     subSequance(str,idx+1,new_string,set);
   }        
   public static void main(String[] args)
   {
      String str = "aaa";
      String new_string = "";
      HashSet<String> set = new HashSet<>();
      subSequance(str,0,new_string,set); 
   }        
}
