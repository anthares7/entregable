import javax.swing.*;
import java.awt.event.*;

public class cambiotitulo {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana");
        JButton boton = new JButton("Cambiar título");

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ventana.setTitle("Otro título");
            }
        });

        ventana.add(boton);
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
