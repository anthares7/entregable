import java.awt.*;
import javax.swing.*;

public class flowlayoutn {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout");
        frame.setLayout(new FlowLayout());
        frame.add(new JButton("boton1"));
        frame.add(new JButton("boton2"));
        frame.add(new JButton("boton3"));
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
