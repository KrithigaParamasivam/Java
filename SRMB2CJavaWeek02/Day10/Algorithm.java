import java.util.*;

public class Algorithm {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i<5;i++)
        {
            list.add(s1.nextInt());
        }

        System.out.println("List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List:  " + list);

        int index = Collections.binarySearch(list, 4);
        System.out.println("4  present List  is at " + index);

        index = Collections.binarySearch(list, 3);
        System.out.println("3 present List is  at " + index);

        Collections.shuffle(list);
        System.out.println("shuffling List: " + list);

        Collections.reverse(list);
        System.out.println("reversing List: " + list);

        Collections.swap(list, 1, 3);
        System.out.println("swapping list"+list);


    }
}