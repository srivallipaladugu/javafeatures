package com.spaladugu.demo.strings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramFinderTest {

    private AnagramFinder anagramFinder;
    private String str = "anagram";
    private String str2 = "aangamr";
    private String str3 = "aaannng";
    private String str4 = "aaanngg";

    @BeforeEach
    void setUp() {
        anagramFinder = new AnagramFinder();
    }

    @Test
    void anagramFinderUsingStringMethods() {
        boolean result = anagramFinder.anagramFinderUsingStringMethods(str, str2);
        assertEquals(true, result);
        boolean result2 = anagramFinder.anagramFinderUsingStringMethods(str3, str4);
        assertEquals(false, result2);
        boolean result3 = anagramFinder.anagramFinderUsingStringMethods(str, str3);
        assertEquals(false, result3);
    }

    @Test
    void anagramFinderUsingArrays() {
        boolean result = anagramFinder.anagramFinderUsingArrays(str, str2);
        assertEquals(true, result);
        boolean result2 = anagramFinder.anagramFinderUsingArrays(str3, str4);
        assertEquals(false, result2);
        boolean result3 = anagramFinder.anagramFinderUsingArrays(str, str3);
        assertEquals(false, result3);
    }
}
