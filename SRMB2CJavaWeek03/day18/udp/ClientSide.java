import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientSide
{
    public static void main(String args[]) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        DatagramSocket ds = new DatagramSocket();

        InetAddress ip = InetAddress.getLocalHost();
        byte buf[] = null;


        while (true)
        {
            String inp = sc.nextLine();

            buf = inp.getBytes();

            DatagramPacket DpSend =
                    new DatagramPacket(buf, buf.length, ip, 5555);

            ds.send(DpSend);


            if (inp.equals("bye"))
                break;
        }
    }
}