import javax.swing.*;

public class slidern {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Slider");
        JSlider slider = new JSlider(0, 100, 50);
        frame.add(slider);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
