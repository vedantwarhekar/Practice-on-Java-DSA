/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Administrator
 */
public class StringEqualityOprators 
{
   public static void main(String[] args)
   {
       // str and str1 both point to the same memory location thats why the it return 
       String str = "Hello";
       String str1 = "Hello";
       System.out.println(str == str1); // true
       
       // suppose i need to create same string but i want it to store in different location
       // than i need to use new keyword
       String str2 = new String("Hello");
       // this statement return false because now the both are point different location
       System.out.println(str1 == str2); // false
       // if we need to cheack the two string are equal or not than we need to use 
       System.out.println(str2.equals(str1)); // true
      
   }        
}
