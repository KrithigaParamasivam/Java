import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserPass {
    public static boolean isValidUsername(String name)
    {

        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
        if (name == null) {
            return false;
        }
        Matcher m = p.matcher(name);
        return m.matches();
    }
    public static boolean isValidPassword(String password)
    {
        {

            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";

            Pattern p = Pattern.compile(regex);
            if (password == null) {
                return false;
            }
            Matcher m = p.matcher(password);
            return m.matches();
        }

    }
    public static void main(String[] args)
    {
        System.out.println("Enter the UserName:");
        Scanner s=new Scanner(System.in);
        String username=s.next();
        System.out.println(isValidUsername(username));
        System.out.println("Enter the Password:");
        String password=s.next();
        System.out.println(isValidPassword(password));
        s.close();

    }

}