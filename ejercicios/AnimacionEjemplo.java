import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimacionEjemplo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Animación");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Centrar la ventana

        // Crear un JPanel personalizado
        PanelAnimado panel = new PanelAnimado();
        frame.add(panel);

        // Iniciar la animación con un Timer
        Timer timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.moverCuadrado();
            }
        });

        timer.start();

        frame.setVisible(true);
    }
}

// Clase personalizada para el panel de animación
class PanelAnimado extends JPanel {
    private int x = 0; // Posición inicial del cuadrado

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE); // Color del cuadrado
        g.fillRect(x, 50, 50, 50); // Dibujar cuadrado
    }

    public void moverCuadrado() {
        x += 2; // Velocidad de movimiento
        if (x > getWidth()) x = 0; // Reiniciar cuando llegue al borde
        repaint(); // Redibujar la pantalla
    }
}
