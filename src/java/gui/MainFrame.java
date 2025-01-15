package gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Online Farmers Market");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Buttons
        JButton registerButton = new JButton("Register User");
        JButton viewFarmersButton = new JButton("View Farmers");
        JButton orderButton = new JButton("Order Produce");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(registerButton);
        buttonPanel.add(viewFarmersButton);
        buttonPanel.add(orderButton);

        add(buttonPanel, BorderLayout.CENTER);

        // Event Handlers
        registerButton.addActionListener(e -> new RegisterUser());
        viewFarmersButton.addActionListener(e -> new FarmersList());
        orderButton.addActionListener(e -> new OrderManagement());

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
