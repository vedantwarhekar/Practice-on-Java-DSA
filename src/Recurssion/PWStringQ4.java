/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;
import java.util.ArrayList;
/**
 * given a string return all its sub sequance in a given string
 * @author c068
 */
public class PWStringQ4 
{
   static ArrayList<String> getSSQ(String str)
   {
      ArrayList<String> ans = new ArrayList<>();
      if(str.length() == 0)
      {
        ans.add("");
        return ans;
      } 
      char crr = str.charAt(0);
      ArrayList<String> smallans = getSSQ(str.substring(1));
      for(String s : smallans)
      {
        ans.add(s);
        ans.add(crr + s);
      }
      return ans;
   }        
   public static void main(String[] args)
   {
       String str = "abc";
       System.out.println(getSSQ(str));
   }        
}
