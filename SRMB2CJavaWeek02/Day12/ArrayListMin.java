import java.util.ArrayList;

class ArraylistMin {
    public static void minToFront(ArrayList<Integer> array) {
        int minIndex = 0;

        for (int i = 1; i < array.size(); i++) {
            if (array.get(minIndex) > array.get(i)) {
                minIndex = i;
            }
        }

        int minValue = array.remove(minIndex);
        array.add(0, minValue);
    }
    public static void main(String args[])
    {
        ArrayList<Integer> li= new ArrayList<Integer>();
        li.add(5);
        li.add(9);
        li.add(3);
        li.add(15);
        li.add(13);
        System.out.println("Elements in Array list ");
        for(Integer s:li)
        {
            System.out.print(s+"  ");
        }
        minToFront(li);
        System.out.println();
        System.out.println("Elements after swaping");
        for(Integer s:li)
        {
            System.out.print(s+"  ");
        }
    }
}