package org.webpagevalidation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
//
//    @Test
//    void main() {
//    }
//
//    @Test
//    void jsoupGetText() {
//    }

    @Test
    void validate() {
        Assertions.assertTrue(App.validate("https://www.google.com","Gmail"));
    }
}