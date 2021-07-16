package day22;

interface GenericInterface<T> {
    T func(T t);
}


public class LambdaGeneric {

    public static void main( String[] args ) {

        GenericInterface<String> reverse = (str) -> {

            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--)
            result += str.charAt(i);
            return result;
        };

        System.out.println("Lambda reversed = " + reverse.func("krithiga"));

        GenericInterface<Integer> factorial = (num) -> {

            int result = 1;
            for (int i = 1; i <= num; i++)
            result = i * result;
            return result;
        };

        System.out.println("factorial of 5 = " + factorial.func(5));
    }
}