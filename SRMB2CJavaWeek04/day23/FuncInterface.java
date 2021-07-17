import java.util.function.IntBinaryOperator;

public class FuncInterface {

    public static void main(String args[]) {

        IntBinaryOperator sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.applyAsInt(12, 100));

    }
}