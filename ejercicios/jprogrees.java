import javax.swing.*;



public class jprogrees {

public static void main(String[] args) {

    JFrame frame = new JFrame("Progreso");
    JProgressBar progressBar = new JProgressBar(0, 100);
    progressBar.setValue(80);

    frame.add(progressBar);
    frame.setSize(300, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

}

}
