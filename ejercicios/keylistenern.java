import java.awt.event.*;
import javax.swing.*;

public class keylistenern {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tecla presionada");
        JTextField textField = new JTextField(20);
        textField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                System.err.println("tecla presionada" + e.getKeyChar());
            }
        });
        frame.add(textField);
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
