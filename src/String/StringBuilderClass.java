/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Administrator
 */
public class StringBuilderClass 
{
  public static void main(String[] args)
  {
  // we are use to stringbuilder class because of 
  //    * it will also create string
  //    * it not use intering that means every String has theior own address
  //    * also String builder calss is remove immutability thats means we are change the
  //      character of string without reassign them. like arrays set method
  //    * string has poor porformance but String builder has high performance
      
      StringBuilder str = new StringBuilder("hello");
      str.append(" madhav");
      System.out.println(str);
      System.out.println(str.charAt(10));
      //str.setCharAt(3, 'o');
      System.out.println(str);
      str.insert(6, " Keshav ,");
      System.out.println(str);  
      str.delete(0, 5);
      System.out.println(str);
      System.out.println(str.substring(3));
      /////////////////////////////////////////////
      System.out.println("/////////////////////////////////");
      ////////////////////////////////////////////////
      
      StringBuilder str1 = new StringBuilder("physics");
      System.out.println(str1);
      str1.reverse();
      System.out.println(str1);
      
      
  }        
}
