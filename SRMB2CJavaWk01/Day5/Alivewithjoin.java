
public class Alivewithjoin extends Thread
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
        // t1.start();
        // t2.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println("Thread1");
        t1.start();

        try
        {
            t1.join(1500);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
        System.out.println("Thread2");
        t2.start();

        try
        {
            t2.join(1500);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }

    }
}