import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardLayoutExample {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the panel with CardLayout
        JPanel panel = new JPanel(new CardLayout());

        // Create the first card (panel)
        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card 1"));
        JButton nextButton = new JButton("Go to Card 2");
        card1.add(nextButton);

        // Create the second card (panel)
        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card 2"));
        JButton prevButton = new JButton("Go back to Card 1");
        card2.add(prevButton);

        // Add cards to the cards panel
        panel.add(card1, "Card1");
        panel.add(card2, "Card2");

        // Add action listeners to switch between cards
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(panel.getLayout());
                cl.show(panel, "Card2");
            }
        });

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(panel.getLayout());
                cl.show(panel, "Card1");
            }
        });

        // Add the cards panel to the frame
        frame.add(panel);

        // Display the frame
        frame.setVisible(true);
    }
}