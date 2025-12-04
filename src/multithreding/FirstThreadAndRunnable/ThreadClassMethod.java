package multithreding.FirstThreadAndRunnable;

//Join Method Demo
//public class ThreadClassMethod extends Thread{
//    @Override
//    public void run()
//    {
//        for(int i = 1; i <=5 ;i++)
//        {
//            try {
//                Thread.sleep(5000);
//            }catch (InterruptedException e)
//            {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        ThreadClassMethod tcm = new ThreadClassMethod();
//        tcm.start();
//        tcm.join();
//        System.out.println("Hello");
//    }
//}

//=================================================================================

////Example od Set Priority Method
//public class ThreadClassMethod extends Thread{
//
//    public ThreadClassMethod(String name){
//        super(name);
//    }
//
//    @Override
//    public void run()
//    {
//        for(int i = 1; i <=10000 ;i++)
//        {
//            System.out.println(Thread.currentThread().getName()+ " - Priority: "+Thread.currentThread().getPriority()+"- count "+i);
//            try{
//                Thread.sleep(10);
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        ThreadClassMethod l = new ThreadClassMethod("Low Priority Thread");
//        ThreadClassMethod m = new ThreadClassMethod("Medium Priority Thread");
//        ThreadClassMethod n = new ThreadClassMethod("High Priority Thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        n.setPriority(Thread.MAX_PRIORITY);
//        l.start();
//        m.start();
//        n.start();
//    }
//}

//==================================================================================================

// Thread Interrupted Method Demo
//public class ThreadClassMethod extends Thread{
//    @Override
//    public void run()
//    {
//        try{
//            Thread.sleep(1000);
//            System.out.println("Thread is running..........");
//        }catch (InterruptedException e)
//        {
//            System.out.println("Thread interrupted: "+e);
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        ThreadClassMethod tcm = new ThreadClassMethod();
//        tcm.start();
//        tcm.interrupt();
//    }
//}
//=================================================================================================
// Yield Method Example
//public class ThreadClassMethod extends Thread{
//    @Override
//    public void run()
//    {
//        for(int i = 1; i <=5 ;i++)
//        {
//            System.out.println(Thread.currentThread().getName()+ "is running!");
//            Thread.yield();
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        ThreadClassMethod tcm = new ThreadClassMethod();
//        ThreadClassMethod tcm2 = new ThreadClassMethod();
//        tcm.start();
//        tcm2.start();
//    }
//}
//===========================================================================================

//Demon Thread Example
public class ThreadClassMethod extends Thread{
    @Override
    public void run()
    {
       while (true)
       {
           System.out.println("Hello World!");
       }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadClassMethod tcm = new ThreadClassMethod();
        tcm.setDaemon(true);
        tcm.start();
        System.out.println("Main Done");
    }
}