/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * write a program to print string in reverse order
 * @author c068
 */
public class PWStringQ2 
{
   static void reverser(String str,int j)
   {
     if(j < 0)
     {
        return;
     }
     System.out.print(str.charAt(j));
     reverser(str,j-1);
   } 
   static String reverser_1(String str,int idx)
   {
      if(idx == str.length()) return "";
      String smallans = reverser_1(str,idx+1);
      return smallans + str.charAt(idx);
   }        
   static String reverser1(String str)
   {
      if(str.length() == 0) return "";
      String smallans = reverser1(str.substring(1));
      return smallans+str.charAt(0);
   }        
   public static void main(String[] args)
   {
       String str = "aba";
       System.out.println(reverser_1(str,0));
       String rev = reverser_1(str,0);
       if(rev.equals(str))
       {
         System.out.println("Palindrome");
       }
       else
       {
           System.out.println("Not Palindrome");
       }    
   }        
}
