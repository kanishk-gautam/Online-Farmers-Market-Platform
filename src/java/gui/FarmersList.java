package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FarmersList extends JFrame {
    public FarmersList() {
        setTitle("Farmers List");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Table
        String[] columns = {"Name", "Produce", "Price per Kg"};
        String[][] data = {
                {"John Doe", "Apples", "2.5"},
                {"Jane Smith", "Tomatoes", "1.8"}
        };
        JTable table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }
}
