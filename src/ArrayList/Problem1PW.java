/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
/**
 * // w.A.P to reverse a arraylist
 * @author Administrator
 */
public class Problem1PW 
{
     static void reverseArrayList(ArrayList<Integer> a1)
     {
        int i = 0,j = a1.size()-1;
        while(i<j)
        {
           Integer temp = a1.get(i);
           a1.set(i, a1.get(j));
           a1.set(j, temp);
           
           i++;
           j--;
        }    
            
     }        
     public static void main(String[] args)
     {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(4);
        a1.add(3);
        a1.add(2);
        a1.add(1);
        
//        System.out.println(a1);
//        reverseArrayList(a1);
//        System.out.println(a1);
//        
        // using directly collection .reverse method
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);
     }        
}
