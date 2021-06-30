import java.util.LinkedList;

public class Linklist {
    public static void main(String[] args) {

        LinkedList<String> slist = new LinkedList<String>();
        LinkedList<Integer> ilist = new LinkedList<Integer>();

        slist.add("A");
        slist.add("B");
        slist.add("C");
        slist.add("D");
        slist.add("E");
        System.out.println("String list"+slist);

        ilist.add(1);
        ilist.add(2);
        ilist.add(3);
        ilist.add(4);
        ilist.add(5);
        System.out.println("Integer list"+ilist);


        System.out.println(ilist.contains(1)?" contains 1":" not contain");
        System.out.println(slist.contains("FF")?" contains":" not contain FF");


        if (slist.contains("B")) {
            System.out.println("Element is present in List");
        } else {
            System.out.println("List doesn't present");
        }


        if (ilist.contains(4)) {
            System.out.println("Element is present in List");
        } else {
            System.out.println("List doesn't have element ");
        }
    }
}