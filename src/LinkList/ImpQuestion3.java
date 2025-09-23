/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkList;
import LinkList.LL.Node;

/**
 *
 * @author Administrator
 */
public class ImpQuestion3 
{
   public static boolean hasCycle(Node head)
   {
      if(head == null)
      {
        return false;
      }    
      Node hare = head;
      Node turtle = head;
      while(hare != null && hare.next != null)
      {
        hare = hare.next.next;
        turtle = turtle.next;
        
        if(hare == turtle)
        {
          return true;
        }    
     }    
      return false;
   }        
   public static void main(String[] args)
   {
      LL list = new LL();
      list.addFirst("a");
      list.addFirst("b");
      
      System.out.println(hasCycle(list.head));
   }        
}
