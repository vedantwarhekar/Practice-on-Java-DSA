package Queue;

import java.util.Scanner;

class Queue
{
    int arr[];
    int front = -1;
    int rear = -1;
    int size;

    Queue(int size)
    {
      arr = new int[size];
      this.size = size;

    }

    public void enqueue(int element)
    {
      if(rear == size-1){
          System.out.println("Queue Overflow");
          return;
      }
      if(front == -1)
      {
         front = 0;
         rear = 0;
      } else {
          rear = rear + 1;
      }
      arr[rear] = element;
    }

    public int dequeue(){
        if(front == -1)
        {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = arr[front];
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }else {
             front++;
        }
        return item;
    }

    public boolean isEmpty()
    {
        return front == -1;
    }

    public int peek()
    {
        if(isEmpty())
            return -1;
        return arr[front];
    }
}

public class QueueUsingArrayV2 {

    public static void main(String[] args)
    {
        Queue q = new Queue(5); // queue of size 5

        // Test enqueue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        // This should print "Queue Overflow"
        q.enqueue(60);

        // Test peek
        System.out.println("Front element: " + q.peek()); // Expected: 10

        // Test dequeue
        System.out.println("Dequeued: " + q.dequeue()); // Expected: 10
        System.out.println("Dequeued: " + q.dequeue()); // Expected: 20

        // Check peek after dequeues
        System.out.println("Front element after 2 dequeues: " + q.peek()); // Expected: 30

        // Empty the queue
        System.out.println("Dequeued: " + q.dequeue()); // Expected: 30
        System.out.println("Dequeued: " + q.dequeue()); // Expected: 40
        System.out.println("Dequeued: " + q.dequeue()); // Expected: 50

        // Now queue is empty
        System.out.println("Dequeued from empty: " + q.dequeue()); // Expected: "Queue Underflow" + -1
        System.out.println("Peek from empty: " + q.peek());        // Expected: "Queue is empty" + -1

        // Check isEmpty
        System.out.println("Is queue empty? " + q.isEmpty()); // Expected: true
    }
}
