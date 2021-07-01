import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorClass {
    public static void main(String a[]){
        ListIterator<String> litr = null;
        List<String> names = new ArrayList<String>();
        names.add("white");
        names.add("yellow");
        names.add("blue");
        names.add("green");
        names.add("red");

        litr=names.listIterator();
        ListIterator<String> iterate = names.listIterator();

        System.out.println("The list in forward direction:");
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        System.out.println("\n The list in backward direction:");
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        int num1 = iterate.nextIndex();
        System.out.println("Position of Next Element: " + num1);

        int num2 = iterate.previousIndex();
        System.out.println("Position of the Previous element: " + num2);
    }
}