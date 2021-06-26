import java.util.Random;

class RandomInteger extends Thread {

    public void run()
    {
        Random random = new Random();
        for (int i = 0; i < 10; i++)
        {
            int randInt = random.nextInt(10);
            System.out.println("Random Integer generated : " + randInt);

            if((randInt%2) == 0)
            {
                SquareThread sThread = new SquareThread(randInt);
                sThread.start();
            }
            else
            {
                CubeThread cThread = new CubeThread(randInt);
                cThread.start();
            }
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }
}

class SquareThread extends Thread {
    int number;
    SquareThread(int square)
    {
        number = square;
    }
    public void run()
    {
        System.out.println("Square of " + number + " = " + (number * number));
    }
}

class CubeThread extends Thread
{
    int number;
    CubeThread(int cube)
    {
        number = cube;
    }
    public void run()
    {
        System.out.println("Cube of " + number + " = " + number * number * number);
    }
}

public class MultiThreading
{
    public static void main(String args[])
    {
        RandomInteger r = new RandomInteger();
        r.start();
    }
}
