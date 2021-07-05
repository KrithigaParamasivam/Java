import java.util.Arrays;
import java.util.TreeSet;

public class Duplicate {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,5,5,3,7,7,9,11,11,2};
        System.out.println("Initial Array is : " + (Arrays.toString(array)));
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (Integer i : array) {
            if (!treeSet.add(i)) {
                System.out.println("Duplicate Element is: " + i);
            }
        }
        System.out.println("TreeSet is : " + treeSet);
    }
}