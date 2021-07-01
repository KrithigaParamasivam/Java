import java.util.*;
class HashMapKv {
    public static void main(String[] args)
    {
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        map.put(1, 50);
        map.put(2, 60);
        map.put(3, 30);
        map.put(4, 60);
        map.put(5, 60);
        System.out.println(map);
        int minValueInMap=(Collections.min(map.values()));
        int maxValueInMap=(Collections.max(map.keySet()));
        System.out.println("smallest value:"+minValueInMap);
        System.out.println("Largest key:"+maxValueInMap);
        System.out.println("Size of map is:" + map.size());
    }
        }

