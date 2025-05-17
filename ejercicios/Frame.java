import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        // Create the window
        JFrame frame = new JFrame("Ventana Básica");

        // Set window size
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fix the incorrect reference

        // Make the window visible
        frame.setVisible(true);
    }
}
