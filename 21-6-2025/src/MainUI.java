import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI extends JFrame {
    public MainUI() {
        // Initialize the JFrame first
        setSize(1080, 650);
        // setBackground(Color.decode("#3a3a3a"));

        // Setting out main panel
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Setting out the menu panel by initialize the AdminMenu object
        JPanel menuPanel = new AdminMenu();

        // Setting out the content panel that use to display page content
        JPanel contentPanel = new ContentMenu();
        contentPanel.setBackground(Color.decode("#3a3a3a"));
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));


        // Adding menu panel and ontent panel to main panel
        mainPanel.add(menuPanel, BorderLayout.WEST);
        mainPanel.add(contentPanel, BorderLayout.CENTER);

        // Create a simple dropdown menu
        String[] options = {"Select an option", "Option 1", "Option 2"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setPreferredSize(new Dimension(300, 40));
        comboBox.setBackground(Color.white);
        comboBox.setFont(new Font("Minecraft Ten", Font.PLAIN, 16));
        comboBox.setToolTipText("Nigga");
        // Create action listerner
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                System.out.printf("Selected Item: %s", selectedItem);
            }
        });

        // Customize the combo box
        comboBox.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (isSelected) {
                    setBackground(new Color(70, 130, 180));
                    setForeground(Color.WHITE);
                } else {
                    setBackground(index % 2 == 0 ? new Color(240, 240, 240) : Color.WHITE);
                    setForeground(Color.BLACK);
                }

                return this;
            }
        });

        mainPanel.add(comboBox, BorderLayout.SOUTH);

        // For creating the side menu, using JButton and sort it in vertically
        add(mainPanel);

        // ermmm somehow need to put this at the last
        setVisible(true);
    }

    public static void main(String[] args) {
        MainUI main = new MainUI();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}