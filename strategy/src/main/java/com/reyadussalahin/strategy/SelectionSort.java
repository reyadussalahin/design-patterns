package com.reyadussalahin.strategy;


import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectionSort implements SortingStrategy {
    public Integer[] apply(Integer[] array) {
        log.info("Sorting strategy: Selection Sort");
        Integer[] buf = Arrays.copyOf(array, array.length);
        Arrays.sort(buf);
        return buf;
    }
}
