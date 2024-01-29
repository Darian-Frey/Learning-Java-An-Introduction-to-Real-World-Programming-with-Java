import javax.swing.*;
import java.awt.*;

public class Goodbye {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Goodbye, Java!");
        frame.setSize(300, 150);
        frame.add(new GoodbyeComponent());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}

class GoodbyeComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Goodbye, Java!", 125, 75);
    }
}