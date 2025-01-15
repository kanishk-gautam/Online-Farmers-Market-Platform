package gui;

import javax.swing.*;
import java.awt.*;

public class OrderManagement extends JFrame {
    public OrderManagement() {
        setTitle("Order Management");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Feature Under Development", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        setVisible(true);
    }
}
