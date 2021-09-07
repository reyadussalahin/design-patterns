package com.reyadussalahin.strategy;


import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;



/**
 * 
 * InsertionSort class provides a method named "apply" that can perform insertion sort
 * on integer array
 * 
 */
@Slf4j
public class InsertionSort implements SortingStrategy {
    public Integer[] apply(Integer[] array) {
        log.info("Sorting strategy: Insertion Sort");

        // performing insertion sort
        Integer[] buf = Arrays.copyOf(array, array.length);
        
        for(int i=0; i<buf.length; ++i) {
            int j = i-1, key = buf[i];
            while(j >= 0 && key < buf[j]) {
                buf[j+1] = buf[j];
                --j;
            }
            buf[j+1] = key;
        }

        return buf;
    }
}
