package com.reyadussalahin.strategy;


import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;


/**
 * 
 * SelectionSort class provides a method named "apply" that can perform insertion sort
 * on integer array
 * 
 */
@Slf4j
public class SelectionSort implements SortingStrategy {

    public void swap(Integer[] arr, int i, int j) {
        Integer temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    public Integer[] apply(Integer[] array) {
        log.info("Sorting strategy: Selection Sort");

        // performing selection sort
        Integer[] buf = Arrays.copyOf(array, array.length);

        for(int i=0; i<buf.length; ++i) {
            int x = i;
            for(int j=i+1; j<buf.length; ++j) {
                if(buf[j] < buf[x]) {
                    x = j;
                }
            }
            swap(buf, i, x);
        }

        return buf;
    }
}
