import javax.swing.*;

public class imagelconn {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Imagen con conexión");
        ImageIcon image = new ImageIcon("C:\\Users\\user\\Downloads\\ejercicios\\ejercicios\\descarga.png");
        JLabel label2 = new JLabel(image);
        frame.add(label2);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
