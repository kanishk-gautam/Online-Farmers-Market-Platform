package servlets;

import models.DatabaseConnection;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProduceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> produceList = new ArrayList<>();

        try (Connection conn = DatabaseConnection.connect()) {
            String sql = "SELECT name, produce, price FROM farmers";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String record = rs.getString("name") + " - " + rs.getString("produce") + " - $" + rs.getDouble("price");
                produceList.add(record);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("produceList", produceList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("produce.jsp");
        dispatcher.forward(request, response);
    }
}
