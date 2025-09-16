import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestingCardLayout extends JFrame {
    public TestingCardLayout() {
        // First card layout as the page manager
        CardLayout c1 = new CardLayout();
        CardLayout c2 = new CardLayout();

        // Initialize jframe
        setVisible(true);
        setSize(500, 500);
        setTitle("Testing Card Layout");

        // create panel
        // card layout store panel by card.add
        // card layout show the panel by card.show();

        JPanel panel = new JPanel(new CardLayout());

        JPanel panel1 = new JPanel();
        panel1.setVisible(true);
        JLabel label1 = new JLabel();
        panel1.add(label1, "label1");
        label1.setText("Card 1");

        JPanel panel2 = new JPanel();
        panel1.setVisible(true);
        JLabel label2 = new JLabel();
        panel2.add(label2, "label2");
        label2.setText("Card 2");

        panel.add(panel1);
        panel.add(panel2);

        JButton nextPage = new JButton();
        panel1.add(nextPage);
        nextPage.setText("next page");
        nextPage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout card = (CardLayout) panel.getLayout();
                card.show(panel2, "panel2");
            }
        });


        add(panel);
        //c1.show(panel, "panel1");
    }

    public static void main(String[] args) {
        TestingCardLayout test = new TestingCardLayout();
    }
}
