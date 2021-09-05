package com.reyadussalahin.strategy;


import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class InsertionSortTest {
    @Test
    public void applyTest() {
        Integer[] array = {1, 2, 9, 0, 5};
        Integer[] expected = {0, 1, 2, 5, 9};
        Integer[] sortedArray = (new InsertionSort()).apply(array);
        assertArrayEquals(expected, sortedArray);
    }
}
