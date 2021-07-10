import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingJtable {

    JFrame f;
    JTable j;

    SwingJtable()
    {
        f = new JFrame();

        f.setTitle("JTable Example");

        String[][] data = {
                { "Krithiga", "14", "CSE" },
                { "Divya", "15", "IT" },
                { "Sakthi", "16", "IT" },
                { "varsha", "20", "Mtech" },
                { "mahesh", "18", "IT" },
                { "amal", "19", "Btech" },
                { "krishna", "23", "Bcom" }
        };

        String[] columnNames = { "Name", "Roll Number", "Department" };
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        f.setSize(500, 200);
        f.setVisible(true);
    }
    public static void main(String[] args)
    {
        new SwingJtable();
    }
}