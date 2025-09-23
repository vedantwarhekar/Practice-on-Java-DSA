package LinkList;

/**
 *
 * @author Vedant Warhekar
 */
public class LL
{
  Node head;
  private int size;
  LL()
  {
    this.size =0;
  }        
  class Node
  {
      String data;
      Node next;
    
      Node(String data)
      {  
        this.next = null;
        this.data = data;
        size++;
      }
   }
   public void addFirst(String data)
   {
      Node newNode = new Node(data);
      if(head==null)
      {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
   }
   public void addLast(String data)
   {
      Node newNode = new Node(data);
      if(head==null)
      {
        head = newNode;
        return;
      }
      Node currNode = head;
      while(currNode.next!=null)
      {
         currNode = currNode.next;
      }
      currNode.next = newNode;
   }
   public void deleteFirst()
   {
     if(head==null)
     {
          System.out.println("list is empty");
          return;
     }
     size--;
     head = head.next;
   }
   public void deleteLast()
   {
      if(head == null)
      {
          System.out.println("list is empty");
      }
      size--;
      if(head.next == null)
      {
        head = null;
        return;
      }
      Node secondLast = head;
      Node lastNode = head.next;
      while(lastNode.next != null)
      {
         lastNode = lastNode.next;
         secondLast = secondLast.next;
      } 
      secondLast.next = null;
   }  
   public int size()
   {
      return size;
   }         
   public void printList()
   {
     if(head==null)
     {
       System.out.println("list is empty");
     }    
     Node currNode = head;
     while(currNode!= null)
     {
        System.out.print(currNode.data + "->");
        currNode = currNode.next;
     }
     System.out.println("Null");
   } 
   public void reverseItrative()
   {
       if(head == null || head.next == null)
       {
          return;
       }
       Node prevNode = head;
       Node currNode = head.next;
       while(currNode != null)
       {
          Node nextNode = currNode.next;
          currNode.next = prevNode;
          
          // update
          prevNode =currNode;
          currNode = nextNode;
       }
       head.next = null;
       head = prevNode;
   }
   public Node revrseRecursive(Node head)
   {
     if(head==null || head.next==null)
     {
       return head;
     }    
     Node newNode = revrseRecursive(head.next);
     head.next.next = head;
     head.next =null;
     return newNode;
   }        
   public static void main(String[] args) {
     LL list = new LL();
     list.addFirst("a");
     list.addFirst("is");
     list.printList();
     
     list.addLast("list");
     list.printList();
     
     list.addFirst("this");
     list.printList();
     
//     System.out.println("=============");
//     list.reverseItrative();
//     list.printList();
//     
     System.out.println("=============");
     list.head=list.revrseRecursive(list.head);
     list.printList();
     
     list.deleteFirst();
     list.printList();
     
     list.deleteLast();
     list.printList();
     
     System.out.println(list.size());
     
   }        
   
}
