
class Lthread

{

    public static void main(String args[])

    {

        // Child thread

        new Thread(() -> {

            for(int i=1;i<=5;i++)

            {

                System.out.println("Child Thread "+i);

                try

                {

                    Thread.sleep(100);

                }catch(Exception e){}

            }

        }).start();

        // Main Thead

        for(int i=1;i<5;i++)

        {

            System.out.println("Main Thread "+i);

            try

            {

                Thread.sleep(100);

            }catch(Exception e){}

        }

    }

}
