import java.io.File;
import javax.swing.*;

 

public class imagenarchivo {

   public static void main(String[] args) {

       JFrame frame = new JFrame("Imagen");

       JLabel label = new JLabel();

       frame.add(label);

       frame.setSize(500, 500);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.setVisible(true);



       JFileChooser chooser = new JFileChooser();

       if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

           File archivo = chooser.getSelectedFile();

           label.setIcon(new ImageIcon(archivo.getAbsolutePath()));

       }

   }

}