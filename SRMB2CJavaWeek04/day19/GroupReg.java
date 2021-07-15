import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class GroupReg {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("a(bb)");
        Matcher m=p.matcher("aabbabbabbaaa");
        while(m.find())
            System.out.println("Start :"+m.start()+", End : "+m.end()+", Group "+m.group());
    }
}