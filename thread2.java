public class thread2 implements Runnable
{
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
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
        thread2 t2=new thread2();
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