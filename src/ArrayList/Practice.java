/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArrayList;

/**
 *
 * @author User
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;


public class Practice {
    
   public static void main(String[] args)
   {
       ArrayList<Integer> al = new ArrayList<>();
       
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);
       al.add(5);  
       
       Collections.sort(al,Collections.reverseOrder());
       System.out.println(al);
   }        
}
