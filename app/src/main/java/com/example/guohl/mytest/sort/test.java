package com.example.guohl.mytest.sort;

import java.util.Arrays;

/**
 * Created by guohl on 2016/8/19.
 */
public class test {
    public static void main(String[] args) {
        int[] arr = {1,9,2,6,5,3,4,5};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
