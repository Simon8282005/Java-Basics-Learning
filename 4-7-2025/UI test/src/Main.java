import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public Main() {
        setSize(new Dimension(400, 400));

        JPanel panel = new JPanel(new GridLayout(8, 2, 20, 5));

        JLabel lableId = new JLabel("Id: ");
        lableId.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(lableId);

        JTextField labelTextField = new JTextField("Enter id..", 1);
        panel.add(labelTextField);

        // Name
        JLabel labelName = new JLabel("Name: ");
        lableId.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(labelName);

        JTextField nameTextField = new JTextField("Enter name...", 1);
        panel.add(nameTextField);

        // Rotio button
        JPanel buttonPanel = new JPanel(new FlowLayout());
        String[] option = {"Conference", "Journal"};

        JRadioButton radioButton1 = new JRadioButton("Conference");
        JRadioButton radioButton2 = new JRadioButton("Journal");

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    radioButton2.setEnabled(false);
                } else {
                    radioButton2.setEnabled(true);
                }
            }
        });

        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton2.isSelected()) {
                    radioButton1.setEnabled(false);
                } else {
                    radioButton1.setEnabled(true);
                }
            }
        });

        buttonPanel.add(radioButton1);
        buttonPanel.add(radioButton2);

        // 》。。。。。。。
        JPanel buttonPanel2 = new JPanel();
        JButton submitButton = new JButton("Submit");
        buttonPanel2.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        buttonPanel2.add(submitButton);

        panel.add(buttonPanel);
        panel.add(buttonPanel2);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}