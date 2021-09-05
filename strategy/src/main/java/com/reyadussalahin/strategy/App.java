package com.reyadussalahin.strategy;


import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class App {
    public static void main(String[] args) {
        log.info("Strategy pattern...");
        
        Integer[] array = {1, 9, 8, 7, 4, 2, 0};

        log.info("Unsorted Array: " + Arrays.toString(array));

        SortProvider sortProvider = new SortProvider(new InsertionSort());
        Integer[] sortedArray = sortProvider.sortIntegerArray(array);
        log.info("Sorted Array: " + Arrays.toString(sortedArray));

        sortProvider = new SortProvider(new SelectionSort());
        sortedArray = sortProvider.sortIntegerArray(array);
        log.info("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
