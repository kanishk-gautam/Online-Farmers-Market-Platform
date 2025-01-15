package tests;

import models.Farmer;
import org.junit.Test;
import static org.junit.Assert.*;

public class FarmerTest {
    @Test
    public void testFarmerCreation() {
        Farmer farmer = new Farmer("John Doe", "Apples", 15.0);
        assertEquals("John Doe", farmer.getName());
        assertEquals("Apples", farmer.getProduce());
        assertEquals(15.0, farmer.getPrice(), 0.01);
    }
}
