import java.awt.event.*;
import javax.swing.*;

public class mouselistenern {
    public static void main(String[] args) {
        JFrame frame = new JFrame("click en la ventana");
        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("click en la posición " + e.getX() + " ," + e.getY());
            }
        });
        frame.setSize(400, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
