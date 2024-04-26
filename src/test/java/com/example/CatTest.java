package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CatTest {

    @Mock
    private Feline feline;

    private Cat cat;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        cat = new Cat(feline);
    }

    @Test
    public void testCatGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testCatGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood, cat.getFood());
    }
}
