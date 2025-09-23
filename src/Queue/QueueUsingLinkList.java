/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author Administrator
 */
public class QueueUsingLinkList
{
   static class Node
   {
     int data;
     Node next;
     Node(int data)
     {
       this.data = data;
       next = null; 
     }
   } 
   static class Queue
   {
      static Node head = null;
      static Node tail = null;
      
      public static boolean isEmpty()
      {
        return head == null && tail == null;
      }
      public static void add(int data)
      {
        Node newNode = new Node(data);
        if(tail==null)
        {
          tail = head = newNode; 
          return;
        } 
        tail.next = newNode;
        tail = newNode;
      }
      public static int remove()
      {
        if(isEmpty())
        {
          System.out.println("queue is empty");
          return -1;
        }
        int font = head.data;
        if(head == tail)
        {
          tail = null;
        }    
        head = head.next;
        return font;
      } 
      
      public static int peek()
      {
         if(isEmpty())
         {
           System.out.println("queue is empty");
           return -1;
         } 
         return head.data;
      }        
    }
   public static void main(String[] args)
   {
      Queue q1 = new Queue();
      q1.add(5);
      q1.add(4);
      q1.add(3);
      q1.add(2);
      q1.add(1);
      
      while(!q1.isEmpty())
      {
         System.out.println(q1.peek());
         q1.remove();
      }   
   }        
}
