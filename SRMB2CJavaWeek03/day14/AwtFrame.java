import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;

public class AwtFrame {

    public static void main(String[] args) {

        Frame frame = new Frame("Awt Frame");
        Component textArea = new TextArea("write your text...");
        Component button = new Button("Click Me!!");
        frame.add(textArea, BorderLayout.NORTH);
        frame.add(button, BorderLayout.SOUTH);


        int width = 300;

        int height = 300;

        frame.setSize(width, height);

        frame.setVisible(true);

    }
}
