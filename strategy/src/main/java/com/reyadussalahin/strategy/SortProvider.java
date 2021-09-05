package com.reyadussalahin.strategy;


public class SortProvider {
    private SortingStrategy sort;

    public SortProvider(SortingStrategy sort) {
        this.sort = sort;
    }

    public Integer[] sortIntegerArray(Integer[] array) {
        return this.sort.apply(array);
    }
}
