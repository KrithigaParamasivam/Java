import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidation
{
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
    public static void main(String[] args)
    {
        System.out.println("Enter the email:");
        Scanner s=new Scanner(System.in);
        String email=s.next();
        if (isValid(email))
            System.out.print("valid emailid");
        else
            System.out.print("Invalid Email");
    }
}