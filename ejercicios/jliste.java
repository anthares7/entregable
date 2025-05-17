import javax.swing.*;
public class jliste {
    public static void main(String[] args) {
        JFrame frame = new JFrame("lista de elementos");
        String[] opciones = {"elementouno", "elementotwo", "elementothree"};
        JList<String> lista = new JList<>(opciones);
        frame.add(new JScrollPane(lista));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}