/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.Scanner;
import java.util.Stack;
/**
 * Q Duplicate bracket question
 * @author Administrator
 */
public class Q3
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      
      Stack<Character> st = new Stack<>();
      
      for(int i=0;i<str.length();i++)
      {
         char ch  = str.charAt(i);
         if(ch == ')')
         {
             if(st.peek()=='(')
             {
                System.out.println(true);
                return;
             }else
             {
               while(st.peek()!='(')
               {
                  st.pop();
               } 
               st.pop();
             }    
         }else{
                 st.push(ch);
         }    
      }
      System.out.println(false);
    }        
}
