import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class Iterator1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("The elements in the list : "+list);
        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        itr.remove();
        System.out.println("After the removing : "+list);
    }
}