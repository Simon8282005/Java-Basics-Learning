import jdk.jshell.JShellConsole;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.jar.JarEntry;

public class ContentMenu extends JPanel {

    public ContentMenu() {
        // The main panel that include all the sub panel
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create table model with data
        Object[][] data = {
                {"43300", "Seri Kembangan", "Petaling"},
                {"43300", "Seri Kembangan", "Petaling"},
                {"43300", "Seri Kembangan", "Petaling"},
                {"43300", "Seri Kembangan", "Petaling"},
                {"43300", "Seri Kembangan", "Petaling"}
        };

        JLabel title = new JLabel();
        title.setText("PLACE MANAGER");
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setForeground(Color.white);
        title.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(title, BorderLayout.NORTH);

       // String[] columnNames = {"Postal Code", "Location", "District", "Actions"};
        DefaultTableModel model = new DefaultTableModel(0, 4) {
            @Override
            public boolean isCellEditable(int row, int column) {
                // Only the action column should be editable
                return column == 3;
            }
        };

        // Add enough rows to exceed viewport height
        for (int i = 0; i < 30; i++) {
            model.addRow(new Object[]{"43300", "Seri Kembangan", "Petaling", "Edit/Delete"});
        }

        JTable table = new JTable(model);
        table.setDefaultRenderer(Object.class, new cellRenderer());
        table.setShowGrid(false);
        table.setRowHeight(30);
        table.setIntercellSpacing(new Dimension(0, 0));

        table.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());
        table.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor());

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(800, 400));
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.setBackground(Color.decode("#d9d9d9"));
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane, BorderLayout.CENTER);

    }

    // Default table's cell renderer
    private static class cellRenderer extends DefaultTableCellRenderer {
        public cellRenderer() {
            setHorizontalAlignment(JLabel.CENTER);
        }

        // Custom the component of the table

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);


            if (row % 2 == 0) {
                setBackground(Color.decode("#eae9e6"));
            } else {
                setBackground(Color.decode("#d9d9d9"));
            }

            if (isSelected) {
                setBackground(Color.decode("#0066cc"));
            }

            return this;
        }
    }


    // Button renderer class
    class ButtonRenderer extends JPanel implements javax.swing.table.TableCellRenderer {
        private JButton editBtn = new JButton("Edit");
        private JButton deleteBtn = new JButton("Delete");

        public ButtonRenderer() {
            setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
            setOpaque(true);

            editBtn.setBackground(new Color(70, 130, 180));
            editBtn.setForeground(Color.WHITE);

            deleteBtn.setBackground(new Color(220, 20, 60));
            deleteBtn.setForeground(Color.WHITE);

            add(editBtn);
            add(deleteBtn);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus, int row, int column) {
            setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
            return this;
        }
    }

    // Custom button class
    class ButtonEditor extends AbstractCellEditor implements TableCellEditor {
        private JPanel buttonPanel;
        private int currentRow;

        public ButtonEditor() {

            buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));

            JButton editButton = new JButton("Edit");
            editButton.setBackground(Color.decode("#096bff"));
            editButton.setForeground(Color.white);

            JButton deleteButton = new JButton("Delete");
            deleteButton.setBackground(Color.decode("#ff0000"));
            deleteButton.setForeground(Color.white);

            editButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(ContentMenu.this, "Button Edit has been clicked", "Edit", JOptionPane.INFORMATION_MESSAGE);
                }
            });

            buttonPanel.add(editButton);
            buttonPanel.add(deleteButton);
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            currentRow = row;
            return buttonPanel;
        }

        public Object getCellEditorValue() {
            return "";
        }
    }
}
