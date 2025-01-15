package tests;

import models.ConfigLoader;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConfigLoaderTest {
    @Test
    public void testConfigLoader() {
        assertEquals("Online Farmers Market", ConfigLoader.get("app.title"));
    }
}
