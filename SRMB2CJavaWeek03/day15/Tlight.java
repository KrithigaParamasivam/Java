import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Tlight extends Frame implements ItemListener {


    CheckboxGroup grp = new CheckboxGroup();
    Label msg= new Label("");
    Checkbox redLight = new Checkbox("Red", grp, false);
    Checkbox yellowLight = new Checkbox("Yellow", grp, false);
    Checkbox greenLight = new Checkbox("Green", grp, false);


    Tlight(String t)
    {
        super(t);
        setLayout(new FlowLayout());
        add(redLight);
        add(yellowLight);
        add(greenLight);
        add(msg);
        msg.setFont( new Font("Verdana", Font.BOLD, 40));
        redLight.addItemListener(this);
        yellowLight.addItemListener(this);
        greenLight.addItemListener(this);

    }


    @Override
    public void itemStateChanged(ItemEvent ie) {


        if(redLight.getState() == true) {
            redLight.setForeground(Color.BLACK);
            redLight.setBackground(Color.RED);
            msg.setForeground(Color.RED);
            msg.setText("STOP");
        }
        else if(yellowLight.getState() == true) {
            yellowLight.setForeground(Color.BLACK);
            yellowLight.setBackground(Color.YELLOW);
            msg.setForeground(Color.YELLOW);
            msg.setText("READY");
        }
        else{
            greenLight.setForeground(Color.BLACK);
            greenLight.setBackground(Color.GREEN);
            msg.setForeground(Color.GREEN);
            msg.setText("GO");
        }
    }

    public static void main(String args[])
    {
        Tlight l=new Tlight("Traffic Light");
        l.setSize(300, 400);
        l.setVisible(true);
        l.setBounds(10, 10, 300, 600);

    }


}