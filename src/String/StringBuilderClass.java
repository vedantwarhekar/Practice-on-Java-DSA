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
      // We use the StringBuilder class because:
      // * It is used to create and modify strings.
      // * It does not use string interning, which means every StringBuilder object has its own memory location.
      // * StringBuilder removes immutability, which means we can change the characters of the string
      // without reassigning it, just like we use methods on arrays.
      // * String has poor performance when modified repeatedly, but StringBuilder provides better performance.

        // Difference between StringBuilder and StringBuffer in Java
        //
        // 1) Thread Safety:
        //    - StringBuilder is NOT thread-safe.
        //    - StringBuffer is thread-safe.
        //
        // 2) Performance:
        //    - StringBuilder is faster because it does not use synchronization.
        //    - StringBuffer is slower due to synchronized methods.
        //
        // 3) Synchronization:
        //    - StringBuilder does NOT perform synchronization.
        //    - StringBuffer performs synchronization internally.
        //
        // 4) Use Case:
        //    - Use StringBuilder in a single-threaded environment.
        //    - Use StringBuffer in a multi-threaded environment.
        //
        // 5) Mutability:
        //    - Both StringBuilder and StringBuffer are mutable (they can be modified).
        //
        // 6) Java Version:
        //    - StringBuilder was introduced in Java 1.5.
        //    - StringBuffer was introduced in Java 1.0.
        //
        //
        // Interview One-liner:
        // Use StringBuilder for better performance in single-threaded programs
        // and StringBuffer when thread safety is required.


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
