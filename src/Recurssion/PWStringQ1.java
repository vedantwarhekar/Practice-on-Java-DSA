/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Remove all the occurance of the 'a' from the given string "abcax"
 * @author c068
 */
public class PWStringQ1 
{
  static String removalA(String str,int idx)
  {
     if(idx == str.length())
     {
       return str;
     }    
     if(str.charAt(idx) == 'a')
     {
        str = str.substring(0,idx)+str.substring(idx+1);
     }
     return removalA(str,idx+1);
  } 
  static String removalA2(String str,int idx)
  {
       if(idx == str.length())return "";
       String smallans = removalA2(str,idx+1);
       char curChar = str.charAt(idx);
       if(curChar != 'a')
       {
           return curChar+smallans;
       }else
       {
           return smallans;
       }            
  }
  static String removalA3(String str)
  {
     if(str.length() == 0)return "";
     String smallAns = removalA3(str.substring(1));
     char currChar = str.charAt(0);
     if(currChar != 'a')
     {
       return currChar + smallAns;
     }else
     {
        return smallAns;
     }    
  }        
  public static void main(String[] args)
  {
      String str = "vedant";
      System.out.println(removalA3(str));
  }        
}
