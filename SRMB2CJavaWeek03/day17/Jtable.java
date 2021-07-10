import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
public class Jtable {
    public static void main(String args[]) {

        final Object r[][] = {
                {"1", "Krithiga", "20", "CSE" },
                { "2","Divya", "15", "IT" },
                { "3","Sakthi", "16", "IT" },
                { "4","varsha", "17", "Mtech" },
                { "5","mahesh", "18", "IT" },
                { "6","amal", "19", "Btech" },
                {"7","Kunjol", "31" ,"Police"},
                {"8","Thukidi", "12" ,"Doctor"},
                {"9","Vaibhav", "44" , "Engineer"},
        };

        final Object h[] = {"id","Name", "Age" ,"Occupation"};

        JFrame fr = new JFrame(" Printing table");

        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JTable tb = new JTable(r, h);

        JScrollPane sp = new JScrollPane(tb);
        fr.add(sp , BorderLayout.CENTER);

        JButton button = new JButton("click this button to Print");

        ActionListener act = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    tb.print();
                } catch (PrinterException pe) {
                    System.err.println("Error printing: " + pe.getMessage());
                }
            }
        };
        button.addActionListener(act);
        fr.add(button, BorderLayout.SOUTH);
        fr.setSize(300, 200);
        fr.setVisible(true);
    }
}