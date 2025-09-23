/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PWLinkedList;

/**
 *
 * @author Administrator
 */
public class LLBasic1 {
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
          this.data = data;
        } 
        void display(Node head)
        {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        } 
        void display2(Node head) // using Recurssion
        {
            
         if(head == null)return;
          System.out.print(head.data+" ");
          display2(head.next);
        }
        void display3(Node head)
        {
            if(head == null)return;
            display3(head.next);
            System.out.print(head.data+" ");
        } 
        int count(Node head)
        {
            int count = 0;
          while(head != null)
          {
              count++;
              head = head.next;
          }
          return count;
        }        
    }
    public static void main(String[] args)
    {
      Node a = new Node(5);
      Node b = new Node(4);
      Node c = new Node(3);
      Node d = new Node(2);
      Node e = new Node(1);
      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
      System.out.println(a.data);
      System.out.println(a.next.data);
      System.out.println(a.next.next.data);
      System.out.println(a.next.next.next.data);
      System.out.println(a.next.next.next.next.data);
       System.out.println("====================================");
      // printing all the element using for loop
//      Node temp = a; 
//      for(int i=0;i<5;i++)
//      {
//         System.out.print(temp.data+" ");
//         temp = temp.next;
//      } 
//      System.out.println();
        a.display(a);
       
        d.display2(d);
        System.out.println();
        c.display3(c);
        System.out.println();
        System.out.println(a.count(a));
        System.out.println(b.count(c));
        System.out.println(c.count(d));
        System.out.println(d.count(e));
           
           
           
    }
}
