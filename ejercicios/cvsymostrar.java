import java.io.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class cvsymostrar {

   public static void main(String[] args) {

       JFrame frame = new JFrame("Tabla CSV");

       DefaultTableModel model = new DefaultTableModel();

       JTable table = new JTable(model);

       frame.add(new JScrollPane(table));

       frame.setSize(600, 400);

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       frame.setVisible(true);



       JFileChooser chooser = new JFileChooser();

       if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

           File archivo = chooser.getSelectedFile();

           try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

               String linea;

               boolean encabezado = true;

               while ((linea = br.readLine()) != null) {

                   String[] datos = linea.split(",");

                   if (encabezado) {

                       for (String col : datos) model.addColumn(col);

                       encabezado = false;

                   } else {

                       model.addRow(datos);

                   }

               }

           } catch (IOException e) {

               e.printStackTrace();

           }

       }

   }

}
