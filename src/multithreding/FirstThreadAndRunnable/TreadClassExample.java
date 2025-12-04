package multithreding.FirstThreadAndRunnable;

class DemoThread extends Thread{
    @Override
    public void run(){
        for( ; ;)
        {
            //System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class TreadClassExample {
    public static void main(String[] args)
    {
        DemoThread dth = new DemoThread();
        dth.start();
        for( ; ;)
        {
            // System.out.println("Main Thread");
            System.out.println(Thread.currentThread().getName());
        }
    }
}
