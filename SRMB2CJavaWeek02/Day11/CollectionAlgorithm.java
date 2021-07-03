import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionAlgorithm {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of  element:");
        int[]a=new int[s.nextInt()];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for (int i = 0; i < a.length; i++) {
            list.add(s1.nextInt());
        }

        System.out.println("List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List:  " + list);


        System.out.println("BinaySearch: ");

        int index = Collections.binarySearch(list, 4);
        System.out.println("4 present List  is at " + index);

        index = Collections.binarySearch(list, 3);
        System.out.println("3 present List is  at " + index);

    }
}
