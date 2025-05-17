
import javax.swing.*;

public class radiobotton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("seleccionar opciones");
        JRadioButton rb1Button = new JRadioButton("aceptar 1 ");
        JRadioButton rb2Button = new JRadioButton("aceptar 2");
        ButtonGroup group = new ButtonGroup();

        group.add(rb1Button);
        group.add(rb2Button);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(rb1Button);
        frame.add(rb2Button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}