import java.util.ArrayList;

public class MinMax {
    public static void getMin(ArrayList<Integer> aList) {

        int min = aList.get(0);
        int minIndex = 0;

        for (int i = 1; i < aList.size(); i++) {
            if (aList.get(i) < min) {
                min = aList.get(i);
                minIndex = i;
            }
        }
        System.out.println("ArrayList Min Value is: " + min + ", Found at index: " + minIndex);
    }

    public static void getMax(ArrayList<Integer> aList) {
        int max = aList.get(0);
        int maxIndex = 0;

        for (int i = 1; i < aList.size(); i++) {
            if (aList.get(i) > max) {
                max = aList.get(i);
                maxIndex = i;
            }
        }
        System.out.println("ArrayList Max Value is: " + max + ", Found at index: " + maxIndex);
    }

    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(10);
        aList.add(20);
        aList.add(50);
        aList.add(40);
        aList.add(30);
        aList.add(60);

        System.out.println("Initial array elements"+ aList);

        aList.set(1,70);
        aList.set(3,80);
        System.out.println("After replacing the index value  array elements"+ aList);

        getMin(aList);
        getMax(aList);
    }
}