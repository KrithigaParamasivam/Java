import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtPalindrome extends Frame implements ActionListener {
    Label string = new Label("Enter String");
    TextField str = new TextField();
    Button btn = new Button("Check Palindrome");
    Label result = new Label();
    Label l = new Label();

    AwtPalindrome() {
        string.setBounds(50, 150, 100, 70);
        str.setBounds(150, 150, 150, 70);
        btn.setBounds(50, 250, 120, 40);
        result.setBounds(50, 300, 100, 30);

        add(string);
        add(str);
        add(btn);
        add(result);


        btn.addActionListener(this);
        addWindowListener(new mwa());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String original = str.getText();
        String reverse = "";
        int length = original.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            result.setText("Palindrome");
        else
            result.setText("Not Palindrome");

    }

    public static void main(String args[]) {
        AwtPalindrome frame = new AwtPalindrome();
        frame.setTitle("FINDING PALINDORME OR NOT");
        frame.setVisible(true);
        frame.setBounds(10, 10, 400, 600);
        frame.setResizable(false);
    }


    class mwa extends WindowAdapter {
        public mwa() {
        }

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}