import java.io.*;
public class LowerUpper
{
        public static void main(String[] args)
        {
            try{
                BufferedReader in = new BufferedReader(new FileReader("D:/finalthread.txt"));
                OutputStream File1=new FileOutputStream("C:/copy/lowecase.txt");
                OutputStream File2=new FileOutputStream("C:/copy/uppercase.txt");
                String line = in.readLine();
                while(line != null)
                {
                    line = line.toLowerCase();
                    File1.write((line+"\n").getBytes());
                    line=line.toUpperCase();
                    File2.write((line+"\n").getBytes());
                    line=in.readLine();

                }
                System.out.println("File converted to lowercase and uppercase succesfully");
            }

            catch(IOException e)
            {
                System.out.println("file not found");
            }
        }
    }

