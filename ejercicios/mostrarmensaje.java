import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class mostrarmensaje {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cambiar texto");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Mostrar mensaje");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Hola mundo");
            }
        });

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

