/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
/**
 *  //  Q1 Write a Java program to insert 
 *      an element into given array list of size n at the first position.
 *  //   Q2. Write a Java program to remove the third 
 *     element from given arraylist of size. 
 * //  Q3. Write a Java program to swap two elements 
 *      in an array list of size n.
 * // Q4. Given an input of some integers, sort the integers..
 * @author Administrator
 */
public class AssingmentPW 
{
   public static void main(String[] args)
   {
      ArrayList<Integer> a1 = new ArrayList<>();
      a1.add(1);
      a1.add(2);
      a1.add(3);
      a1.add(4);
      a1.add(5);
      
      // Q1 answer
//      System.out.println("BEFORE insertion :-"+a1);
//      a1.add(0,0);
//      System.out.println("after insertion :-"+a1);

      // Q2 answer     
//      a1.remove(2);
//      System.out.println("after insertion :-"+a1);  
      
      // Q3 answer
//      int i =2, j = 4;
//     Integer temp = a1.get(i);
//     a1.set(i,a1.get(j));
//     a1.set(j,temp);
//     
//     System.out.println(a1);

    // Q4 answer
    
    ArrayList<Integer> a2 = new ArrayList<>();
      a2.add(6);
      a2.add(-3);
      a2.add(3);
      a2.add(1);
      a2.add(9);
      
      System.out.println("List before sorting :- "+a2);
      Collections.sort(a2);
      System.out.println("List after sorting :- "+a2);
      
   }        
}
