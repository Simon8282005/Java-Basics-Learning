import javax.swing.*;

public class MainScene extends JFrame {
    public MainScene() {
        setVisible(true);
        setSize(500, 500);
        setResizable(false);

        // Add label
        JLabel patientNameLabel = new JLabel();
        patientNameLabel.setText("Name: ");
    }
}
