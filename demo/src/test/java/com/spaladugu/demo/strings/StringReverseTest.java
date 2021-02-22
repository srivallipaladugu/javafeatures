package com.spaladugu.demo.strings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    private StringReverse stringReverse;
    private  String str;
    private  String reversedString;

    @BeforeEach
    void setUp() {
        stringReverse = new StringReverse();
        str = "StringReverseCheck";
        reversedString = "kcehCesreveRgnirtS";
    }

    @Test
    void reverseStringTest() {
        String reversed = this.stringReverse.reverseString(str);
        assertEquals(reversed, reversedString);
    }

    @Test
    void reverseUsingStringBufferTest() {
        String reversed = this.stringReverse.reverseUsingStringBuffer(str);
        assertEquals(reversed, reversedString);
    }

    @Test
    void recursionReverseTest() {
        String reversed = this.stringReverse.recursionReverse(str);
        assertEquals(reversed, reversedString);
    }

    @AfterEach
    void tearDown() {

    }

}
