import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {

    public static void main(String[] args)
    {

        int vowels = 0,  characters=0;
        String[] words=null;
        int w=0;
        try{
            BufferedReader in = new BufferedReader(new FileReader("D:/finalthread.txt"));
            String line = in.readLine();
            while(line != null)
            {
                line = line.toLowerCase();
                words=line.split(" ");
                w=w+words.length;

                for (int i = 0; i < line.length(); ++i) {
                    char ch = line.charAt(i);

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    {
                        ++vowels;
                    }
                    else if((ch>='a' && ch<='z')){
                        ++characters;
                    }

                    else{}

                }
                line = in.readLine();

            }
            System.out.println("No of Vowels the file contains: "+vowels);
            System.out.println("No of Words the file conatins: "+w);
            System.out.println("No of characters the file contains : "+characters);
        }

        catch(IOException e)
        {
        }
    }
}