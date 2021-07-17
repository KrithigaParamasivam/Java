import java.util.ArrayList;

class LambdaArray {
    public static void main(String[] args) {

        ArrayList<String> li = new ArrayList<>();
        li.add("blue");
        li.add("yellow");
        li.add("green");
        li.add("blue");
        li.add("red");
        li.add("white");
        System.out.print("Elements in the list: ");
        li.forEach((e) -> {
            System.out.print(e + ", ");
        });
    }
}