package com.todayreservation.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;

public class ShopControllerTest {
    
    @Test
    @DisplayName("First JUnit5 Test")
    public void Junit01Test() {
        Junit01 junit01 = new Junit01();
        assertEquals(2, junit01.method01(1, 1), "return must 2");
        // assertEquals("First Junit5 Test", testInfo.getDisplayName(), () -> "Testinfo injected test");
    }

}
