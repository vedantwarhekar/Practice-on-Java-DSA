/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class ArrayList1
{
    public static void main(String[] args)
    {
       ArrayList<Integer> l1 = new ArrayList<>();
       
       // adding new element in the arraylist
       l1.add(5);
       l1.add(2);
       l1.add(9);
       l1.add(7);
       l1.add(8);
       
       // get an element at index i
       //System.out.println(l1.get(4)); // output =8
       
       // print the elemrent of array list using for loop
//       for(int i=0;i<l1.size();i++)
//       {
//         System.out.println(l1.get(i));
//       } // output = all the element of arraylist in new line by line

         // printing the arraylist directly
          System.out.println(l1);// print all the arraylist directly
          
         // adding element in some index
         l1.add(2,100);
         System.out.println(l1);
         
         // modifying the element at index i
         l1.set(2,10);
         System.out.println(l1);
         
         // removing an element at index i
         l1.remove(2);
         System.out.println(l1);
         
         // removing an element at index e
         l1.remove(Integer.valueOf(8));
         System.out.println(l1);
         
         // cheacking if an element exits
         boolean ans = l1.contains(7);
         System.out.println(ans);        
         
         // if you don't specify an class you can put any type of data together
         ArrayList i2 = new ArrayList();
         
         i2.add("vedant");
         i2.add("warhekar");
         i2.add(10);
         i2.add("madhav");
         System.out.println(i2);
    }        
}
