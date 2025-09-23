/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;
import java.util.Scanner;
import java.util.Stack;
/**
 * # balanced bracket question
 * @author Administrator
 */
public class Q4
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      Stack<Character> st = new Stack<>();
      
      for(int i=0;i<str.length();i++)
      {
         char ch = str.charAt(i);
         if(ch == '(' ||ch == '{'||ch=='[')
         {
            st.push(ch);
         }else if(ch==')')
         {
            boolean val = handleclosing(st,'(');
            if(val == false)
            {
              System.out.println(val);
              return;
            }    
         }
         else if(ch=='}')
         {
            boolean val = handleclosing(st,'{');
            if(val == false)
            {
              System.out.println(val);
              return;
            }   
         }
         else if(ch ==']')
         {
            boolean val = handleclosing(st,'[');
            if(val == false)
            {
              System.out.println(val);
              return;
            }   
         }
      }
      if(st.size()==0)
         {
            System.out.println(true);
         }else
         {
            System.out.println(false);
         }    
   }
   public static boolean handleclosing(Stack<Character> st,char corresch)
   {
         if(st.size()==0)
         {
           return false;
         }
         else if(st.peek() != corresch)
         {
            return false;
         }
         else
         {
           st.pop();
           return true;
         }
   }        
}
