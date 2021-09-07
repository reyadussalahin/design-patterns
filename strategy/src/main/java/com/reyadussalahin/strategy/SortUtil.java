package com.reyadussalahin.strategy;



/**
 * SortUtil uses different strategies to sort an integer array.
 */
public class SortUtil {
    private SortingStrategy sort;

    public SortUtil(SortingStrategy sort) {
        this.sort = sort;
    }

    public Integer[] sortIntegerArray(Integer[] array) {
        return this.sort.apply(array);
    }
}
