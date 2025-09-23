/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author Administrator
 */
public class CircularQueueUsingArray 
{
   static class Queue
   {
     static int[] arr;
     static int size;
     static int rear = -1;
     static int front = -1;
     
     Queue(int size)
     {
        arr = new int[size];
        this.size = size;        
     }
     // empty method
     public static boolean isEmpty()
     {
        return rear==-1 && front==-1;
     }
     // is full method
     public static boolean isFull()
     {
        return (rear+1) % size == front;
     }        
     // eneque
     public static void add(int data)
     {
        if(isFull())
        {
           System.out.println("Queue is Full");
           return;
        }
        // 1st element add
        if(front == -1)
        {
          front = 0;
        }
        rear = (rear+1) % size;
        arr[rear] = data;
     }
     // for removing elements
     public static int remove()
     {
        if(isEmpty())
        {
           System.out.println("empty queue");
           return -1;
        } 
        int result = arr[front];
        // single element conditions
        if(rear==front)
        {
          rear = front =-1;
        }else{
          front = (front+1) %size;
        }
        return result;
     }
     //
     public static int peek()
     {
        if(isEmpty())
        {
          System.out.println("empty queue");
          return -1;
        }
        return arr[front];
     }        
   }
   public static void main(String[] args)
   {
      Queue qr = new Queue(5);
      qr.add(5);
      qr.add(4);
      qr.add(3);
      qr.add(2);
      qr.add(1);
      System.out.println(qr.remove());
      qr.add(7);
      System.out.println(qr.remove());
      qr.add(8);
      
      while(!qr.isEmpty())
      {
         System.out.println(qr.peek());
         qr.remove();
      }    
   }        
}
