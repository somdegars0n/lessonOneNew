package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testCycle() {
        List<Integer> expectedList = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
        List<Integer> actualList = Main.cycle(7);
        assertEquals(expectedList, actualList, "cycle() должен возвращать числа от 0 до 6");
    }
}
