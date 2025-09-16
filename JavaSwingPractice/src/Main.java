import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Frame = a gui window that add component to
        JFrame frame = new JFrame();
        frame.setTitle("Hello Swing..");
        frame.setVisible(true);  // make frame can be see
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create icon image for the frame
        ImageIcon icon = new ImageIcon("C:\\Users\\user\\Documents\\IDEA Projects\\HelloIDEA\\JavaSwingPractice\\Earphone.png");
        frame.setIconImage(icon.getImage());  // change the icon
        frame.getContentPane().setBackground(new Color(0, 0, 0, 0));

        JLabel label = new JLabel();  // use to display text
        label.setText("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.orange);
        label.setFont(new Font("Minecraft Ten", Font.PLAIN, 30));
        label.setIconTextGap(20);  // set gap of text of image
        frame.add(label);

        ImageIcon labelIcon = new ImageIcon("C:\\Users\\user\\Documents\\IDEA Projects\\HelloIDEA\\JavaSwingPractice\\Earphone.png");
        label.setIcon(labelIcon);
    }
}