package com.reyadussalahin.strategy;


import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;


@Slf4j
public class InsertionSort implements SortingStrategy {
    public Integer[] apply(Integer[] array) {
        log.info("Sorting strategy: Insertion Sort");
        Integer[] buf = Arrays.copyOf(array, array.length);
        Arrays.sort(buf);
        return buf;
    }
}