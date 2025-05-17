import java.awt.event.*;
import javax.swing.*;

public class timern {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Temporizador");
        JLabel label = new JLabel("0");
        frame.add(label);
        Timer timer = new Timer(1000, new ActionListener() {
            int contador = 0;
            public void actionPerformed(ActionEvent e) {
                contador++;
                label.setText(String.valueOf(contador));
            }
        });
        timer.start();
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
