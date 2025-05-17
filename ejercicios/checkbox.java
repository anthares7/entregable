import javax.swing.*;

public class checkbox {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("seleccionar opciones");
        JCheckBox checkBox = new JCheckBox("aceptar terminos y condiciones");
        frame.add(checkBox);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
