package multithreding.FirstThreadAndRunnable;


class ThreadLifeCycle extends Thread {
    @Override
    public void run()
    {
        System.out.println("RUNNING");
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        ThreadLifeCycle tcl = new ThreadLifeCycle();
        System.out.println(tcl.getState());
        tcl.start();
        System.out.println(tcl.getState());
        Thread.sleep(100);
        System.out.println(tcl.getState());
        tcl.join();
        System.out.println(tcl.getState());
    }
}
