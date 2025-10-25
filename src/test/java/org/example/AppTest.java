package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @BeforeEach
    public void setUp() {
        // Setup before each test
    }

    @Test
    @DisplayName("Test that addition works correctly")
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result, "2 + 2 should equal 4");
    }

    @Test
    public void testSomethingElse() {
        assertTrue(true);
        assertNotNull(new Object());
    }
}