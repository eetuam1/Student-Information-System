package com.studentinfo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApplicationTest {

    @BeforeAll
    static void initAll() {
        // Setup code, if necessary
        System.out.println("Running setup before all tests");
    }

    @Test
    void contextLoads() {
        // Test that the Spring context loads correctly
    }

    @AfterAll
    static void tearDownAll() {
        // Cleanup code, if necessary
        System.out.println("Running cleanup after all tests");
    }
}
