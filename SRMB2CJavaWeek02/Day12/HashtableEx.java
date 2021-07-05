import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;

public class HashtableEx{

    public static void main(String[] args) {
        String str;
        Hashtable<String, String> hashtable = new Hashtable<String, String>();
        hashtable.put("1", "red");
        hashtable.put("2", "blue");
        hashtable.put("3", "orange");
        hashtable.put("4", "green");
        hashtable.put("5", "yellow");

        System.out.println("The elements in the hashtable are:");
        Set<String> keys = hashtable.keySet();

        Iterator<String> itr = keys.iterator();
        while (itr.hasNext())
        {
            str = itr.next();
            System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
        }
    }
}