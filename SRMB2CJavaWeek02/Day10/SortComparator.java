import java.lang.*;
import java.util.*;

class Student {
    int rollno;
    String name;
    int marks;

    public Student(int rollno, String name, int marks)
    {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public String toString()
    {
        return this.rollno + " " + this.name + " "
                + this.marks;
    }
}

class Rollno implements Comparator<Student> {

    public int compare(Student a, Student b)
    {
        return a.rollno - b.rollno;
    }
}

class Name implements Comparator<Student> {

    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}

class Marks implements Comparator<Student> {

    public int compare(Student a, Student b)
    {
        return a.marks - b.marks;
    }
}


public class SortComparator {
    public static void main(String[] args)
    {
        ArrayList<Student> arr = new ArrayList<Student>();
        arr.add(new Student(111, "krithiga", 60));
        arr.add(new Student(151, "nishitha", 90));
        arr.add(new Student(121, "yazhini", 80));
        arr.add(new Student(141, "abitha", 70));
        arr.add(new Student(131, "divya", 40));
        arr.add(new Student(121, "varsha", 30));

        System.out.println("Before Sorting the element");
       for (int i = 0; i < arr.size(); i++)
           System.out.println(arr.get(i));


        Collections.sort(arr, new Rollno());

        System.out.println("--------------------------");
        System.out.println("\nSorting the list student by rollno");
        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));

        Collections.sort(arr, new Name());


        System.out.println("--------------------------");
        System.out.println("\nSorting the list by student name");
        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));

        Collections.sort(arr, new Marks());

        System.out.println("--------------------------");
        System.out.println("\nSorting the list  by student marks");
        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));

    }
}