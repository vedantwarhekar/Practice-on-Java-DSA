/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkList;

import LinkList.LL.Node;

/**
 *
 * @author Administrator
 * 
 * cheak if a linklist is palindrome or not;
 */
public class ImpQuestion2 
{
   public static Node reverse(Node head)
   {
       Node prev = null;
       Node curr = head;
       while(curr != null)
       {
         Node nextNode = curr.next;
         curr.next = prev;
         prev = curr;
         curr = nextNode;
       }
       return prev;
    }
   public static Node findMiddle(Node head)
   {
      Node hare = head;
      Node turtol = head;
      while(hare.next != null && hare.next.next != null)
      {
         hare = hare.next.next;
         turtol = turtol.next;
      }
      return turtol;
   }        
   public static boolean isPalindeome(Node head)
   {
      if(head == null || head.next == null)
      {
        return true;
      }
      Node middle = findMiddle(head); // 1st half ka end
      Node secondHalfStart = reverse(middle.next);
      Node firstHalfStart = head;
      
      String secHalSrt = secondHalfStart.data;
      String firsthalSrt = firstHalfStart.data;
      
      while(secondHalfStart != null)
      {
        if(firsthalSrt != secHalSrt)
        {
          return false;
        }
         secondHalfStart = secondHalfStart.next;
         firstHalfStart =  firstHalfStart.next;
        if(secondHalfStart != null && firstHalfStart != null)
        {
            secHalSrt = secondHalfStart.data;
            firsthalSrt = firstHalfStart.data;
        }
      }
    
      return true;
   }        
   public static void main(String[] args)
   {
      LL list = new LL();
      list.addFirst("a");
      list.addFirst("b");
      list.addFirst("a");
      
      System.out.println(isPalindeome(list.head));
   }        
}
