package JUnit.Tests;
//https://coderlessons.com/tutorials/java-tekhnologii/vyuchit-junit/junit-kratkoe-rukovodstvo
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestJunit1 {
    @Test
    public void testAdd() {
        //test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //check for not null value
        assertNotNull(temp);
    }
}