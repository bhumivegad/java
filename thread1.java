public class thread1 extends Thread 
{
    public void run()
    {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("thread is running...");
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("inttreup generated");
        }
    }
    public static void main(String args[])
    {
        thread1 t1=new thread1();
        t1.start();
    }
}

/*thread is running...
thread is running...
thread is running...
thread is running...
thread is running...
thread is running...
thread is running...
thread is running...
thread is running...
thread is running... */