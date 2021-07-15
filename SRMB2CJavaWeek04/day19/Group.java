import java.util.regex.*;

public class Group{
    public static void main(String[] args)
    {
        String regex = "\\b(?<j>[A-Za-z\\s]+)";

        Pattern pattern = Pattern.compile(regex);

        String stringToBeMatched = "java training java ";

        Matcher matcher = pattern.matcher(stringToBeMatched);

        MatchResult result = matcher.toMatchResult();
        System.out.println("Current Matcher: " + result);

        while (matcher.find()) {
            System.out.println(matcher.group("j"));
        }
    }
}
