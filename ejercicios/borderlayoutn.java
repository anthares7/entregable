import java.awt.*;
import javax.swing.*;

public class borderlayoutn {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BorderLayout Example");
        frame.setLayout(new BorderLayout());

        // Add buttons to different regions
        frame.add(new JButton("Arriba"), BorderLayout.NORTH);
        frame.add(new JButton("Izquierda"), BorderLayout.WEST);
        frame.add(new JButton("Derecha"), BorderLayout.EAST);
        frame.add(new JButton("Abajo"), BorderLayout.SOUTH);
        frame.add(new JButton("Centro"), BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
