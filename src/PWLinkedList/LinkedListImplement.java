/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PWLinkedList;

/**
 *
 * @author Administrator
 */
public class LinkedListImplement
{
  public static class Node
  {
      int data;
      Node next;
      Node(int data)
      {
        this.data = data;
      }
  }
  public static class LinkedList1
  {
     Node head = null;
     Node tail = null;
     int count = 0;
     //implementation of insert at end method
     void insertAtEnd(int val)
     {
        Node temp = new Node(val);
        if(head == null) // empty list
        {
            head = temp;
        }else{ // non empty list
           tail.next = temp; 
        }
        // we need to point temp as our new tail
        tail = temp;
        count++;
     }   
    
     // implementation of display method
     void display()
     {
         Node temp = head;
         while(temp != null)
         {
            System.out.print(temp.data+" ");
            temp = temp.next;
         }
         System.out.println();
     }  
     
     // implementation of size method
     int size()
     {
//        Node temp = head;
//        int size = 0;
//        while(temp != null)
//        {
//           size++;
//           temp = temp.next;
//        }
        return count;
     }  
     
     // implementation of insertAt head method
     void insertAtHead(int val)
     {
       Node temp = new Node(val);
       if(head == null) // empty list
       {
           //head = tail = temp;
           //because we alredy wrote code for empty ll in
           insertAtEnd(val);
       }else // non empty list
       {
         temp.next = head;
         head = temp;
       } 
       count++;
     } 
     
     // implementation of inserAt method
     void insertAt(int idx,int val)
     {
        Node t = new Node(val);
        Node temp = head;
        if(idx == size())
        {
           insertAtEnd(val);
           return;
        }
        else if(idx == 0)
        {
           insertAtHead(val);
           return;
        }  
        else if(idx < 0 || idx > size())
        {
          System.out.println("wrong idx");
          return;
        } 
        
        for(int i=1;i<=idx-1;i++)
        {
          temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        count++;
     }  
     
     // get at method imple
     int getAt(int idx)
     {
       Node temp = head;
        if(idx < 0 || idx > size())
        {
          System.out.println("wrong idx");
          return -1;
        } 
       for(int i=1;i<=idx;i++)
       {
         temp = temp.next;
       }
       return temp.data;
     }        
     
    // delete at Method
    void deleteAt(int idx)
    {
      if(idx < 0 || idx > size())
        {
          System.out.println("wrong idx");
          return;
        }   
      if(idx == 0)head = head.next;
      Node temp = head;
      for(int i=0;i<=idx-1;i++)
      {
        temp = temp.next;
      } 
      temp.next = temp.next.next;
      if(idx == size()-1)
      {
        tail = temp;
      }    
      count--;
    }        
    
  }
  
  // main method
  public static void main(String[] args)
  {
     LinkedList1 ll = new LinkedList1();
     ll.insertAtEnd(1);
     ll.insertAtEnd(2);
     ll.insertAtEnd(3);
     ll.insertAtEnd(4);
     ll.insertAtHead(0);
     ll.insertAt(2,0);
     ll.insertAt(1,0);
     ll.insertAt(4,0);
     
     ll.display();
     System.out.println(ll.size());
     System.out.println(ll.getAt(5));
     ll.display();
     ll.deleteAt(5);
      ll.display();
     System.out.println(ll.size());
  }        
}
