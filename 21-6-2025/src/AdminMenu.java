import javax.swing.*;
import java.awt.*;

// Create the menu for the admin (side menu)

public class AdminMenu extends JPanel {
    public AdminMenu() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setBackground(Color.decode("#ff7828"));

        JLabel label = new JLabel();
        label.setText("ADMIN MENU");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        // label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));

        add(label);

        // Menu Items, use to create button
        String[] menuItems = {
                "Inventory Manager",
                "Place Manager",
                "Hospital Manager",
                "Register Admin",
                "Register Volunteer",
                "View Donations",
                "Log-out"
        };

        for (String button_title : menuItems) {
            JButton button = new JButton();
            button.setText(button_title);
            button.setBackground(Color.decode("#ffd378"));
            button.setAlignmentY(Component.CENTER_ALIGNMENT);
            button.setMaximumSize(new Dimension(200, 40));
            button.setPreferredSize(new Dimension(200, 40));
            button.addActionListener(e -> handleAction(button_title));
            add(button);
            add(Box.createRigidArea(new Dimension(0, 10)));
        }
    }

    private void handleAction(String button_title) {
        System.out.printf("Button has been click: %s\n", button_title);
    }
}
