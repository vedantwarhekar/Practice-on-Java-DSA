/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * write a java program to reverse a string
 * @author Administrator
 */
public class Problem7
{
   public static void reverseString(String str,int idx)
   {
      if(idx == 0)
      {
        System.out.println(str.charAt(idx));
        return;
      }    
      System.out.print(str.charAt(idx));
      reverseString(str,idx-1);
   }
   public static void main(String[] args)
   {
     String name = "vedant";
     reverseString(name,name.length()-1);
   }        
}
