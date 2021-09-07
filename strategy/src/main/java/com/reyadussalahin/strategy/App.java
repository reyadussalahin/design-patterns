package com.reyadussalahin.strategy;


import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;


/**
 * 
 * Strategy pattern provides a way to select an algorithm's behavior at runtime
 * 
 */

@Slf4j
public class App {
    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        // GoF strategy pattern
        log.info("Strategy pattern...");
        
        Integer[] array = {1, 9, 8, 7, 4, 2, 0};

        log.info("Unsorted Array: " + Arrays.toString(array));

        SortUtil sortUtil = new SortUtil(new InsertionSort());
        Integer[] sortedArray = sortUtil.sortIntegerArray(array);
        log.info("Sorted Array: " + Arrays.toString(sortedArray));

        sortUtil = new SortUtil(new SelectionSort());
        sortedArray = sortUtil.sortIntegerArray(array);
        log.info("Sorted Array: " + Arrays.toString(sortedArray));
    }
}
