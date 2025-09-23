/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
/**
 * write a program to reverse a Arraylist in decending order
 * @author Administrator
 */
public class Problem2pw 
{
    public static void main(String[] args)
    {
      ArrayList<Integer> a1 = new ArrayList<>();
      a1.add(1);
      a1.add(2);
      a1.add(3);
      a1.add(4);
      a1.add(5);
      
      Collections.sort(a1,Collections.reverseOrder());
      System.out.print(a1);
      
    }        
}
