public class AliveThread extends Thread
{
    public void run()
    {
        System.out.println("hi ");
        try {
            Thread.sleep(300);
        }
        catch(InterruptedException ie)
        {
           System.out.println("Thread error");
        }
        System.out.println("hello");

    }
    public static void main(String[] args)
    {
        AliveThread t1=new AliveThread();
        AliveThread t2=new AliveThread();
        t1.start();
        t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
    }
}