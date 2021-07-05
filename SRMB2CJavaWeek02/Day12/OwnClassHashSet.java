import java.util.HashSet;
import java.util.Iterator;

class MyOwnClass {
    private String name;
    private int age;

    MyOwnClass(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString()
    {

        return "Name :" + name + " "+ "Age :" + " " + age;
    }
}

public class OwnClassHashSet {
    public static void main(String args[]){
        HashSet<MyOwnClass> hs=new HashSet<MyOwnClass>();
        hs.add(new MyOwnClass("krithi",22));
        hs.add(new MyOwnClass("divya",23));
        hs.add(new MyOwnClass("bhuvi",21));
        hs.add(new MyOwnClass("sara",24));
        Iterator<MyOwnClass> i=hs.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }

}