import java.util.*;
public class Substrings {

   static List<String> list = new ArrayList<>();
    private static void substr(String s,String a)
    {
        if (s.length() == 0) {
            list.add(a);
            return;
        }
        substr(s.substring(1), a + s.charAt(0));
        substr(s.substring(1), a);
    }

    public static void main(String[] args) {
        String s = "abc";
        substr(s, "");
        System.out.println(list);
    }
}