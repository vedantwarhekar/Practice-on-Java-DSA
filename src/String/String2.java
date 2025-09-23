/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 * // IMp methods of String
 * @author Administrator
 */
public class String2 
{
   public static void main(String[] args)
   {
       String name = "Vedant";
       String name2 = "Madhav";
       String str = "Physics";
       System.out.println(name.charAt(3));
       System.out.println(name.indexOf('e')); 
       System.out.println(name2.compareTo(name));
       System.out.println(name.contains("V"));
       System.out.println(name.startsWith("Ve"));
       System.out.println(name.endsWith("m"));
       System.out.println(name.toUpperCase());
       System.out.println(name.toLowerCase());
       System.out.println(name.concat( " loves "+name2));
       System.out.println(name.substring(0,3));
       for(int i=2;i<4;i++)
       {
          System.out.println(str.substring(i));
       }    
   }        
}
