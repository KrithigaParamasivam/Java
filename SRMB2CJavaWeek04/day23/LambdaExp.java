interface Arithmetic {
    int operate(int a, int b);
}
enum Operation {
    ADD, SUB, MUL, DIV
}
public class LambdaExp {
    public static void main(String[] args) {
        print((a, b) -> a + b, Operation.ADD);
        print((a, b) -> a - b, Operation.SUB);
        print((a, b) -> a * b, Operation.MUL);
        print((a, b) -> a / b, Operation.DIV);
    }

    static void print(Arithmetic ar, Operation op) {
        switch (op) {
            case ADD:
                System.out.println("The addition of a and b is: " + ar.operate(40, 20));
                break;
            case SUB:
                System.out.println("The subtraction of a and b is: " + ar.operate(40, 20));
                break;
            case MUL:
                System.out.println("The multiplication of a and b is: " + ar.operate(40, 20));
                break;
            case DIV:
                System.out.println("The division of a and b is: " + ar.operate(40, 20));
                break;
            default:
                throw new AssertionError();
        }
    }
}
