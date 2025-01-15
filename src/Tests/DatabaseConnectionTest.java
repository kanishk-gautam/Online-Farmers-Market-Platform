package tests;

import models.DatabaseConnection;
import org.junit.Test;
import java.sql.Connection;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {
    @Test
    public void testDatabaseConnection() {
        Connection connection = DatabaseConnection.connect();
        assertNotNull(connection);
    }
}
