public class Classclass
{
    public static void main(String[] args)
            throws ClassNotFoundException
    {
        Class c = Class.forName("java.lang.String");

        String s = "javaTraining";
        int i = 10;

        boolean b1 = c.isInstance(s);
        boolean b2 = c.isInstance(i);

        System.out.println("is s instance of String : " + b1);
        System.out.println("is i instance of String : " + b1);
        Class c2 = int.class;
        Class c3 = void.class;
        System.out.print("Class represented by c2: ");
        System.out.println(c2.toString());
        System.out.print("Class represented by c3: ");
        System.out.println(c3.toString());
    }
}
