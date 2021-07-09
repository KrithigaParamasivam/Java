import java.awt.*;
import java.awt.event.*;

public class Count extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public Count () {
        setLayout(new FlowLayout());
        lblCount = new Label("Counter");
        add(lblCount);

        tfCount = new TextField(count + "", 10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("Count");
        add(btnCount);

        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);

        setTitle("AWT Counter");
        setSize(500, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        Count app = new Count();

    }

    private class BtnCountListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            ++count;
            tfCount.setText(count + "");
        }
    }
}