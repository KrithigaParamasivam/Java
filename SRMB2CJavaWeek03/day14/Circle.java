import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Circle extends Frame implements ActionListener {
    Label radius = new Label("Enter Radius");
    TextField rValue = new TextField();
    Button calculate = new Button("Calculate Area");
    Label result = new Label();


    Circle() {
        radius.setBounds(50, 150, 100, 30);
        rValue.setBounds(150, 150, 150, 30);
        calculate.setBounds(50, 250, 100, 30);
        result.setBounds(50, 300, 100, 30);

        add(radius);
        add(rValue);
        add(calculate);
        add(result);

        calculate.addActionListener(this);
        addWindowListener(new mwa());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int r = Integer.parseInt(rValue.getText());

        double area = 3.14 * r * r;
        result.setText("Area of circle=" + String.valueOf(area));

    }

    public static void main(String args[]) {
        Circle frame = new Circle();
        frame.setTitle("CIRCLE AREA CALCULATION");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setResizable(false);
    }
}
    class mwa extends WindowAdapter
    {
        public mwa(){

        }
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }
