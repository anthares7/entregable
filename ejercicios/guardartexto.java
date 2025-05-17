import java.io.*;
import javax.swing.*;



public class guardartexto {

   public static void main(String[] args) {

       JFrame frame = new JFrame("Guardar Texto");

       JTextArea area = new JTextArea(20, 40);

       JButton boton = new JButton("Guardar");

       frame.add(new JScrollPane(area), "Center");

       frame.add(boton, "South");

       frame.pack();

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.setVisible(true);



       boton.addActionListener(e -> {

           JFileChooser chooser = new JFileChooser();

           if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

               File archivo = chooser.getSelectedFile();

               try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {

                   bw.write(area.getText());

                   JOptionPane.showMessageDialog(frame, "Archivo guardado.");

               } catch (IOException ex) {

                   ex.printStackTrace();

               }

           }

       });

   }

}

 

 