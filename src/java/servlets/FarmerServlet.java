package servlets;

import models.Farmer;
import models.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class FarmerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String produce = request.getParameter("produce");
        double price = Double.parseDouble(request.getParameter("price"));

        try (Connection conn = DatabaseConnection.connect()) {
            String sql = "INSERT INTO farmers (name, produce, price) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, produce);
            stmt.setDouble(3, price);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("farmer.jsp");
    }
}
