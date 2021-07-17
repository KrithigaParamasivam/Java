import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Generic {
    public static void main(String[] args) {
        Function<String[], List<String>> asList = Arrays::<String>asList;

        String[] namesArray = { "CSS", "Java", "HTML" };
        List<String> namesList = asList.apply(namesArray);
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}