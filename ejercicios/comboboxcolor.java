import javax.swing.*;

public class comboboxcolor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("selecionar color");
        String[] opciones = {"rojo", "verde", "azul"};
        JComboBox<String> comboBox = new JComboBox<String>(opciones);
        frame.add(comboBox);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
