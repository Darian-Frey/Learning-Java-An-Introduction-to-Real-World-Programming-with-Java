import javax.swing.*;
import java.awt.*;

public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        frame.setSize(300, 150);
        //JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
        //frame.add(label);
        frame.add(new HelloComponent());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}

class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Hello, Java!", 125, 75);
    }
}
