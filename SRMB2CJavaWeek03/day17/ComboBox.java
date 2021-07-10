import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class ComboBox extends JFrame implements ItemListener {

    static JFrame f;
    static JLabel l, l1;
    static JComboBox c1;
    public static void main(String[] args)
    {

        f = new JFrame("frame");
        ComboBox s = new ComboBox();
        f.setLayout(new FlowLayout());
        String s1[] = { "chennai", "Mumbai", "Noida", "Kolkata", "New Delhi" };
        c1 = new JComboBox(s1);
        c1.addItemListener(s);
        l = new JLabel("select your city ");
        l1 = new JLabel("chennai selected");
        l.setForeground(Color.blue);
        l1.setForeground(Color.blue);
        JPanel p = new JPanel();
        p.add(l);
        p.add(c1);
        p.add(l1);
        f.add(p);
        f.setSize(400, 300);

        f.show();
    }
    public void itemStateChanged(ItemEvent e)
    {
        if (e.getSource() == c1) {
            l1.setText(c1.getSelectedItem() + " selected");
        }
    }
}