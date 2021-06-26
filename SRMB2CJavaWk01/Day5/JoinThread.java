
public class JoinThread extends Thread
{
    JoinThread (String str){
        super(str);
    }

    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args)
    {
        JoinThread  t1=new JoinThread ("first thread");
        JoinThread  t2=new JoinThread ("second thread");
        t1.start();

        try
        {
            t1.join(1500);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }

        t2.start();

        try
        {
            t2.join(1500);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
}
