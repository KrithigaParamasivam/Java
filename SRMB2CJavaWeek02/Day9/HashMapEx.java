import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

    public static void main(String[] args) {

        Map<Integer, String> hmap = new HashMap<>();

        hmap.put(1, "blue");
        hmap.put(2, "green");
        hmap.put(3, "yellow");
        hmap.put(4, "pink");
        hmap.put(5, "grey");
        hmap.put(6, "white");

        System.out.println(hmap.get(10));
        System.out.println(hmap.get(2));
        System.out.println();


        for (String item : hmap.values())
        {
            System.out.println(item);
        }

        Set keys = hmap.keySet();
        System.out.println(keys);

        System.out.println("Size of map is:- " + hmap.size());
        System.out.println(hmap);


        if (hmap.containsKey(1))
        {
            String s = hmap.get(2);
            System.out.println("value for key" + " \"2\" is: " + s);
        }
    }
    }
