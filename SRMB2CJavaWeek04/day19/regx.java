import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regx {
    public static void main(String args[])
    {
        String str = "java@training@week4";
        String[] arrOfStr = str.split("@", 5);

        for (String a : arrOfStr)
            System.out.println(a);


    String find = "java";

    Pattern pattern = Pattern.compile(find);

    String stringToBeMatched = "javatraining";

    Matcher matcher = pattern.matcher(stringToBeMatched);

        System.out.println(matcher.find());
}

}
