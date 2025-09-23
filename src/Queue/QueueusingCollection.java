package  Queue;

import java.util.Queue;
import java.util.ArrayDeque;

public class QueueusingCollection
{
   public static void main(String[] args)
   {
       //Queue<Integer> qr = new LinkedList<>();
       Queue<Integer> qr = new ArrayDeque<>();
       qr.add(1);
       qr.add(2);
       qr.add(3);
       qr.add(4);
       qr.add(5);

       while(!qr.isEmpty())
       {
        System.out.println(qr.peek());
        qr.remove();
       }
   } 
}