import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class PhoneDirectory {
    private TreeMap<String, String> data;

    public PhoneDirectory() {
        data = new TreeMap<String, String>();
    }

    public String getNumber(String name)
    {
        return data.get(name);
    }

    public void putNumber(String name, String number)
    {
        if (name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");
        data.put(name, number);
    }

    public void print()
    {
        for (Map.Entry<String, String> entry : data.entrySet())
            System.out.println(entry.getKey() + ":  " + entry.getValue());
    }
}
public class TreeMap2 {

    public static void main(String[] args)
    {
        PhoneDirectory d1 = new PhoneDirectory();

        System.out.println();
        d1.putNumber("krithiga","9879879877");
        d1.putNumber("nisha","79797987987");
        d1.putNumber("yazhini","87686868868");
        d1.putNumber("divya","98797987767");
        d1.putNumber("sara","97987968767");

        System.out.println("The phone directory list are:");
        System.out.println();
        d1.print();
        System.out.println();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the name to get phone number:");
        System.out.println(d1.getNumber(s1.next()));
        System.out.println("Enter your name to update your phone number:");

        //System.out.println("Number for krithiga is " + d1.getNumber("krithiga"));
        //System.out.println("Number for divya is " + d1.getNumber("divya"));
        //System.out.println("Number for kevin is " + d1.getNumber("kevin"));
        //System.out.println("Number for sakthi is " + d1.getNumber("sakthi"));

    }

}