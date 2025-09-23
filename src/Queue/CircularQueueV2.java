package Queue;

class CircularQueue{
    int arr[];
    int size;
    int front = -1;
    int rear = -1;

    CircularQueue(int size)
    {
        arr = new int[size];
        this.size = size;
    }
    public boolean isEmpty()
    {
        return front == -1;
    }
    public boolean ifFull(){
        return  (rear + 1) % size == front;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Array is Empty!");
            return -1;
        }
        return arr[front];
    }

    public void enqueue(int element)
    {
        if((front == 0 && rear == size-1 )  || (front == rear + 1))
        {
          System.out.println("The Queue is Completely filled");
          return;
        }
        if(front == -1)
        {
            front = 0;
            rear = 0;
        }else {
            rear = (rear + 1) % size;
        }
        arr[rear] = element;
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            return -1;
        }
        int ele = arr[front];
        if(front == rear)
        {
            front = -1;
            rear = -1;
        }else {
            front = (front + 1) % size;
        }
        return  ele;
    }
}

public class CircularQueueV2 {

    public static void main(String[] args)
    {
        CircularQueue q = new CircularQueue(5); // queue size 5

        // ✅ Test 1: Enqueue elements until full
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50); // should fill the queue
        q.enqueue(60); // should print "Queue is full!"

        // ✅ Test 2: Peek front
        System.out.println("Peek: " + q.peek()); // Expected: 10

        // ✅ Test 3: Dequeue a few elements
        System.out.println("Dequeued: " + q.dequeue()); // Expected: 10
        System.out.println("Dequeued: " + q.dequeue()); // Expected: 20

        // ✅ Test 4: Add more elements to check circular nature
        q.enqueue(60);
        q.enqueue(70);

        // ✅ Test 5: Queue should still be full now
        q.enqueue(80); // should print "Queue is full!"

        // ✅ Test 6: Dequeue all elements
        while (!q.isEmpty()) {
            System.out.println("Dequeued: " + q.dequeue());
        }

        // ✅ Test 7: Try dequeue on empty queue
        System.out.println("Dequeued from empty: " + q.dequeue()); // should print "Queue is empty!" + -1

        // ✅ Test 8: Peek on empty queue
        System.out.println("Peek on empty: " + q.peek()); // should print "Queue is empty!" + -1
    }
}
