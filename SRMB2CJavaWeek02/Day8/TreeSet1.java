import java.util.*;
class TreeSet1 {
    public static void main(String args[]) {
        TreeSet<Integer> tset = new TreeSet<Integer>();
        Iterator<Integer> itr = tset.iterator();

        tset.add(5);
        tset.add(6);
        tset.add(7);
        tset.add(10);
        tset.add(9);
        System.out.println("Elements of Treeset: ");
        System.out.println(tset);

        int sum = 0;
        System.out.println("Sum using For loop:");
        for(int i:tset)
            sum=sum+i;
        System.out.println("Sum= "+sum);


        System.out.println("Sum using for while loop");
        while (itr.hasNext()) {
            sum += itr.next();
        }
        System.out.println("Sum "+sum);

    }
}


