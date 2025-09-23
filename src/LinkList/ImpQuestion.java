/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkList;

import LinkList.LL.Node;

/**
 *
 * @author Administrator
 * Q find the nth element from the last.
 */
public class ImpQuestion
{
  public static Node removenthFromLast(Node head,int n)
  {
      if(head.next == null)
      {
        return null;
      }
      int size =0;
      Node curr = head;
      while(curr != null)
      {
        curr = curr.next;
        size++;
      }
      if(n==size)
      {
        return head.next;
      }    
      Node prev = head;
      int i =0;
      int indextoSearch = size - n;
      while(i<indextoSearch)
      {
        prev = prev.next;
        i++;
      }
      prev.next = prev.next.next;
      return head;
  }
  public static void main(String[] args)
  {
     LL list = new LL();
     list.addFirst("a");
     list.addLast("b");
     list.addLast("c");
     list.addLast("d");
     list.addLast("e");
     list.addLast("f");
     
     Node currNode = list.head;
     removenthFromLast(currNode,3);
     // note we have to pass index from last
     list.printList();
  }        
}
