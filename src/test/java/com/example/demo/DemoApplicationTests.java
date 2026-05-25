
package com.example.demo;

import org.junit.jupiter.api.Test;

class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void brokenTest() {
        throw new RuntimeException("NAMJERNI FAIL");
    }
}
