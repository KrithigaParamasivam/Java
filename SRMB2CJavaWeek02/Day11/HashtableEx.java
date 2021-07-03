 import java.util.Hashtable;
import java.util.Enumeration;
 public class HashtableEx{
    public static void main(String[] args) {

        Enumeration names;
        String key;
        Hashtable<String, String> ht = new Hashtable<String, String>();
        ht.put("1","blue");
        ht.put("2","green");
        ht.put("3","yellow");
        ht.put("4","pink");
        ht.put("5","violet");

        names = ht.keys();
        while(names.hasMoreElements()) {
            key = (String) names.nextElement();System.out.println("Key: " +key+ " & Value: " + ht.get(key));
        }

        ht.remove("5");
        System.out.println("After remove: "+ ht);

        ht.putIfAbsent("8","brown");
        ht.putIfAbsent("9","grey");
        System.out.println("Updated Map: "+ht);
        System.out.println(ht.getOrDefault("1", "Not Found"));
        System.out.println(ht.getOrDefault("10", "Not Found"));
    }
}
