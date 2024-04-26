package com.example;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int inputKittensCount;
    private final int expectedKittensCount;

    public FelineParameterizedTest(int inputKittensCount, int expectedKittensCount) {
        this.inputKittensCount = inputKittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 1 },
                { 10, 10 },
                { 0, 0 }
        });
    }
    @Test
    public void testFelineGetKittensCount() {
        Feline feline = new Feline();
        assertEquals(expectedKittensCount, feline.getKittens(inputKittensCount));
    }
}
