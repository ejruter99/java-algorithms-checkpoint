package com.galvanize;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTest {

    Algorithm algorithm;
    LinkedHashMap<String, Long> results;

    @BeforeEach
    public void setup(){
        algorithm = new Algorithm();
        results = new LinkedHashMap<>();
    }

    @Test
    public void testingAAAReturnsTrueForAllEqual(){
        assertTrue(algorithm.allEqual("aAa"));
    }

    @Test
    public void testingABAReturnsFalseForAllEqual(){
        assertFalse(algorithm.allEqual("Aba"));
    }

    @Test
    public void testingEmptyStringReturnsFalseForAllEqual(){
        assertFalse(algorithm.allEqual(""));
    }

    @Test
    public void testingAAEqualsCorrectlyForLetterCount() {
        results.put("a", 2L);
        assertEquals(results, algorithm.letterCount("aa"));
    }

    @Test
    public void testingABBCDEqualsCorrectlyForLetterCount() {
        results.put("a", 1L);
        results.put("b", 2L);
        results.put("c", 1L);
        results.put("d", 1L);
        assertEquals(results, algorithm.letterCount("abBcd"));
    }

    @Test
    public void testingBlankEqualsCorrectlyForLetterCount() {
        assertEquals(results, algorithm.letterCount(""));
    }

    @Test
    public void testingBlankEqualsCorrectlyForInterleave() {
        assertEquals("", algorithm.interleave(Collections.emptyList(), Collections.emptyList()));
    }

    @Test
    public void testingTwoArraysInterLeaveCorrectly() {
        assertEquals("adbecf", algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f")));
    }

    @Test
    public void testingTwoArraysInterLeaveCorrectlyAgain() {
        assertEquals("abcdef", algorithm.interleave(Arrays.asList("a", "c", "e"), Arrays.asList("b", "d", "f")));
    }


}
