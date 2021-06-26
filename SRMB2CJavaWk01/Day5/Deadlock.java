public class Deadlock
{
    public static Object resource1 = new Object();
    public static Object resource2 = new Object();

    public static void main(String args[])
    {
        ThreadFirst t1 = new ThreadFirst();
        ThreadSecond t2 = new ThreadSecond ();
        t1.start();
        t2.start();
    }

    private static class ThreadFirst extends Thread
    {
        public void run()
        {
            synchronized (resource1)
            {
                System.out.println("Thread 1: Locked resource 1...");

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for resource 2...");

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked recource 1 & 2...");
                }
            }
        }
    }
    private static class ThreadSecond extends Thread
    {
        public void run()
        {
            synchronized (resource2)
            {
                System.out.println("Thread 2: Locked resource 2...");

                try
                {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for resource 1...");

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1 & 2...");
                }
            }
        }
    }
}