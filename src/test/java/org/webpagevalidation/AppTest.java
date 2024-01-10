package org.webpagevalidation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AppTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @ValueSource(strings = {"Gmail", "Google", "Images"})
    void validateUrl(String testStr) {
//        String url ="";
//        url = System.getProperty("baseURL");
//        Assertions.assertTrue(App.validate(url,testStr))
        Assertions.fail();
    }
}