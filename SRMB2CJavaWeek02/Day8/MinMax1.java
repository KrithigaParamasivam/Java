import java.util.*;

public class MinMax1 {
    public static void main(String args[]) throws Exception
    {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);

        System.out.println("List: " + list);
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Minimum value of list is: " + min);
        System.out.println("Maximum value of list is: " + max);
    }
}