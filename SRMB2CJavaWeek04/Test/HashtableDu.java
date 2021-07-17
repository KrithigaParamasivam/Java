import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;

public class HashtableDu{

    public static void main(String[] args) {

        String str;

        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        hashtable.put("A", "black");
        hashtable.put("B", "green");
        hashtable.put("C", "yellow");
        hashtable.put("D", "gray");
        hashtable.put("E", "violet");
        hashtable.put("E", "violet");
        hashtable.put("E", "violet");

        System.out.println("Hashtable contains:");
        Set<String> keys = hashtable.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) {
            str = itr.next();

            System.out.println("Key: "+str+" & Value: "+hashtable.get(str));
        }
        String s = hashtable.remove("c");
        System.out.println(hashtable);


    }
}