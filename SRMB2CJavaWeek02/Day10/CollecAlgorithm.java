import java.util.*;

public class CollecAlgorithm {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        PriorityQueue queue = new PriorityQueue();
        HashSet set = new HashSet();

        Scanner s1=new Scanner(System.in);
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


       // Random num = new Random();

        //for(int i = 0; i < 5; i++) {
          //  list.add(num.nextInt(100));
            //queue.add(num.nextInt(100));
            //set.add(num.nextInt(100));
            //map.put(i, num.nextInt(100));
       // }

        System.out.println("List => " + list);
        System.out.println("Queue => " + queue);
        System.out.println("Set => " + set);
        System.out.println("Map => " + map);
        System.out.println("---------------------------------------");

        Collections.sort(list);
        System.out.println("List in ascending order => " + list);

        System.out.println("Largest element in set => " + Collections.max(set));
        System.out.println("Smallest element in set => " + Collections.min(set));


        System.out.println("Smallest element in queue => " + Collections.min(queue));
        System.out.println("Smallest element in queue => " + Collections.max(queue));

        Collections.reverse(list);
        System.out.println("List in reverse order => " + list);

        Collections.shuffle(list);
        System.out.println("List after shuffle => " + list);

        


    }
}