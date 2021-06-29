import java.io.*;
import java.util.Scanner;

public class CopyFile {

    public static void main(String args[])
    {
        String sourcefile, destfile;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Source File Name (with extension like source.txt) : ");
        sourcefile = scan.nextLine();
        System.out.print("Enter Destination File Name (with extension like destination.txt) : ");
        destfile = scan.nextLine();

        InputStream in = null;
        OutputStream out = null;

        try
        {
            File file1 =new File(sourcefile);
            File file2 =new File(destfile);

            in = new FileInputStream(file1);
            out = new FileOutputStream(file2);

            byte[] buffer = new byte[1024];

            int length;
            while ((length = in.read(buffer)) > 0)
            {
                out.write(buffer, 0, length);
            }

            if (in != null)
                in.close();
            if (out!= null)
                out.close();

            System.out.println("File Copied..");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}