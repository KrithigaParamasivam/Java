import java.io.*;
class Employee implements java.io.Serializable {
    public String name;
    public String address;
}
public class Serialization {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "KRITHIGA";
        e.address = "ADYAR,chennai";

        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\File\\employee1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            out.flush();
            fileOut.close();
            System.out.printf("Serialized data is saved in employee.txt");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}
