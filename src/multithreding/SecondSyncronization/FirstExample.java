package multithreding.SecondSyncronization;

//Resource for study:- https://engineeringdigest.medium.com/multithreading-in-java-39f34724bbf6

class Counter{
    private int count = 0;

    public synchronized void increment()
    {
        count++;
    }

//    Synchronized block
//    public synchronized void increment()
//    {
//        synchronized (this)
//        {
//            count++;
//        }
//    }

    public int getCount()
    {
        return count;
    }
}

class MyThread extends Thread{
    private Counter counter;

    public MyThread(Counter counter)
    {
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i = 0; i < 1000; i++)
        {
            counter.increment();
        }
    }
}

public class FirstExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch (Exception e)
        {

        }
        System.out.println(counter.getCount());
    }
}
