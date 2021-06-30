import java.util.LinkedList;

public class Element {
    public static void main(String[] args)
    {
        LinkedList<Integer> llist = new LinkedList<>();

        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);
        llist.add(6);
        llist.add(7);

        int element = 4;

        int num = -1;

        for (int i = 0; i < llist.size(); i++) {

            int llElement = llist.get(i);
            if (llElement == element) {
                num = i;
                break;
            }
        }

        if (num == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println(
                    "Element 4 found in Linked List at index: " + num);
        }
    }
}