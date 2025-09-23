/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author Administrator
 */
public class QueueUsingArray 
{
   static class Queue
   {
      static int[] arr;
      static int size;
      static int rear = -1;
      
      Queue(int size)
      {
         arr = new int[size];
         this.size = size;
      }
      public static boolean isEmpty()
      {
         return rear == -1;
      }
      // enqueue or add operation
      public static void add(int data)
      {
         if(rear == size-1)
         {
            System.out.println("size fulled");
            return;
         }
         rear++;
         arr[rear] = data;
       }
      // dequeue or remove
      public static int remove()
      {
        if(isEmpty())
        {
          System.out.println("queue is empty");
          return -1;
        }
        int font = arr[0];
        for(int i=0;i<rear;i++)
        {
           arr[i] = arr[i+1];
        }
        rear --;
        return font;
      } 
      public static int peek()
      {
         if(isEmpty())
         {
            System.out.println("Queue is Empty");
            return -1;
         }
         return arr[0];
      }        
   } 
   public static void main(String[] args)
   {
      Queue q1 = new Queue(5);
      q1.add(5);
      q1.add(4);
      q1.add(3);
      q1.add(2);
      q1.add(1);
      
      System.out.println(q1.isEmpty());
      System.out.println(q1.peek());
      System.out.println(q1.remove());
      System.out.println(q1.peek());
    
   }   
}
