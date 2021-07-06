public class Replacestring{
    public static void main(String args[]) {

        String s = new String("this is java training");
        System.out.println("Original String is : " + s );
        System.out.println();

        System.out.println("After replacing 'java' with 'python': " + s.replace("java", "python"));
        System.out.println();


        System.out.println("After replacing 't' with 'z': " + s.replace('t', 'z'));
        System.out.println();

        System.out.println("After removing all spaces" +s.replaceAll("\\s", ""));

    }
}