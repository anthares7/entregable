import java.awt.*;
import javax.swing.*;


public class gridlayoutn {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout");
        frame.setLayout(new GridLayout(2, 2));
        frame.add(new JButton("boton1"));
        frame.add(new JButton("boton2"));
        frame.add(new JButton("boton3"));
        frame.add(new JButton("boton4"));
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
