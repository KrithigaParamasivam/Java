public class Maximum {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String args[]) {

        System.out.println("Maximum of integer object: "+maximum(3, 4, 5));
        System.out.println("Maximum of float object: "+maximum(5.6,
                8.8, 7.7));
        System.out.println("Maximum of string object: "+maximum(
                "welcome", "hello", "hi"));
    }
    }
