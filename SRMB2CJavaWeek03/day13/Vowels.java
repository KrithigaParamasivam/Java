import java.util.Scanner;


public class Vowels {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an String : ");
        String line = scanner.nextLine();
        int v = 0, w = 1;
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++v;
            }
            if (ch==' ') {
                ++w;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Words: " + w);
        scanner.close();
    }
}