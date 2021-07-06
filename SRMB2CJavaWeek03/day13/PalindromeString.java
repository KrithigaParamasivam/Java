import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[])
    {
        String arr[]=new String[3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Strings");
        for(int i=0;i<3;i++)
        {
            arr[i]=in.next();
        }
        for(String str:arr)
        {
            String  reverse = "";
            int length = str.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + str.charAt(i);
            if (str.equals(reverse))
                System.out.println(str+" is a palindrome.");
            else
                System.out.println(str+" isn't a palindrome.");
        }

    }
}