package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StandardNotationTest {
    @Test
    void testDependencyWithStandardNotation() {
        // Simple test
        HelloWorld app = new HelloWorld();
        String message = app.getMessage();
        assertNotNull(message);
        assertEquals("Hello from project without classifier!", message);
    }
}
