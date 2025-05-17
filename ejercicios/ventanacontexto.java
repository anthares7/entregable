
import javax.swing.*;
public class ventanacontexto {
    public static void main(String[] args) {
        JFrame frame = new JFrame("texto en el texfiled");
        JTextField textField = new JTextField(20);


        frame.add(textField);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
