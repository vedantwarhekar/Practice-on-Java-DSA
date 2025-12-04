package multithreding.FirstThreadAndRunnable;


class DemoThreadRunnable implements Runnable{
    @Override
    public void run(){
        for( ; ;)
        {
            //System.out.println("World");
            System.out.println(Thread.currentThread().getName());
        }
    }
}


public class RunabbleExample {

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
