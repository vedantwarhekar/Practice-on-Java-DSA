/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * print all the sub sequance of the given string
 * @author c068
 */
public class PWStringQ5 
{
   static void printSS(String str,String currans)
   {
     if(str.length() == 0)
     {
       System.out.println(currans);
       return;
     }
     char chrr = str.charAt(0);
     String remstr = str.substring(1);
     printSS(remstr,currans+chrr); // decided to come
     printSS(remstr,currans); // not decided to come
   }        
   public static void main(String[] args)
   {
     String str = "abc";
     printSS(str,"");
   }        
}
