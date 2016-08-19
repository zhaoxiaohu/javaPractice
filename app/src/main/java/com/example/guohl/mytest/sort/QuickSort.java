package com.example.guohl.mytest.sort;

import java.util.Arrays;

/**
 * Created by guohl on 2016/8/19.
 */
public class QuickSort {
    int[] a;

    private void swap(int x, int y) {
        System.out.print("\r\nswap index (" + x + ", " + y + ")" +"    -> " + " swap(" + a[x] + ", " + a[y] + ")");

        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }

    private void quickSortRecursive(int start, int end) {
        if (start >= end) {
            return;
        }

        // 假设中间值
        int mid = a[end];
        int left = start, right = end - 1;
        while (left < right) {
            while (a[left] < mid && left < right) {
                left++;
            }
            while (a[right] > mid && left < right) {
                right--;
            }
            swap(left, right);
        }
        System.out.print("\r\nleft: " + left+" right: " + right);
        // left与right重合的情况
        if (a[left] >= a[end]) {
            swap(left, end);
        } else {
            left++;
        }

        quickSortRecursive(start, left - 1);
        quickSortRecursive(left + 1, end);
    }

    public void quickSort(int[] arr) {
        a = arr;
        quickSortRecursive(0, a.length - 1);
    }

}
