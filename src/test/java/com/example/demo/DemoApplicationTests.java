
package com.example.demo;

import org.junit.jupiter.api.Test;

class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void brokenTest() {
        org.junit.jupiter.api.Assertions.fail("namjerni fail");
    }
}
