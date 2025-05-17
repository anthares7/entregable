import javax.swing.*;
public class menu {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" ventana con menu");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        JMenuItem menuItem = new JMenuItem("guardar");
        JMenuItem menuItem2 = new JMenuItem("Abrir");
        menu.add(menuItem);
        menu.add(menuItem2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
}
}