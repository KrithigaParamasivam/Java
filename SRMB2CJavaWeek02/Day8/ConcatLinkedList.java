import java.util.*;
 public class ConcatLinkedList{
    public static void main(String[] args) {

        LinkedList <String> c1 = new LinkedList <String> ();

        c1.add("Red");
        c1.add("white");
        c1.add("Black");
        c1.add("White");
        c1.add("Grey");
        System.out.println("First list: " + c1);
        LinkedList <String> c2 = new LinkedList <String> ();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("second list: " + c2);


        LinkedList <String> a = new LinkedList <String> ();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list: " + a);
    }
}