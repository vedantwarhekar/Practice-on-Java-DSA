/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q write a program to identifiy the given string is palindrome or not using recurssion
 * @author c068
 */
public class PWStringQ3 
{
    static boolean Palindrome(String str,int start,int end)
    {
        if(start >= end)return true;
        if(str.charAt(start) == str.charAt(end))
        {
           return Palindrome(str,start+1,end-1);
        }
         return false;
    }        
    public static void main (String[] args)
    {
      String name = "acea";
      boolean bg = Palindrome(name,0,name.length()-1);
      System.out.println(bg);
    }        
}
