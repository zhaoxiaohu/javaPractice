package com.example.guohl.mytest.sort;

import android.support.annotation.NonNull;

/**
 * Created by guohl on 2016/8/19.
 */
public class Sort {
    //冒泡排序->
    public static void bubblingSort(@NonNull int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }

    // 插入排序->
    public static void insertSort(@NonNull int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j - 1] <= a[j]) {
                    break;
                }
                int tmp = a[j - 1];
                a[j - 1] = a[j];
                a[j] = tmp;
            }
        }
    }

    //归并排序 ->
    public static void mergeSort(@NonNull int[] a) {
        int len = a.length;
        int[] result = new int[len];
        mergeSortRecursive(a, result, 0, len - 1);
    }

    public static void mergeSortRecursive(@NonNull int[] a, @NonNull int[] result, int start, int end) {
        if (start >= end) {
            return;
        }

        int len = end - start, middle = (len >> 1) + start;
        int start1 = start, end1 = middle;
        int start2 = middle + 1, end2 = end;
        mergeSortRecursive(a, result, start1, end1);
        mergeSortRecursive(a, result, start2, end2);

        int k = start;
        while (start1 <= end1 && start2 <= end2) {
            result[k++] = (a[start1] < a[start2]) ? a[start1++] : a[start2++];
        }
        while (start1 <= end1) {
            result[k++] = a[start1++];
        }
        while (start2 <= end2) {
            result[k++] = a[start2++];
        }

        for (int i = start; i <= end; i++) {
            a[i] = result[i];
        }
    }

    public static void mergeSort2(@NonNull int[] a) {
        int len = a.length;
        int[] result = new int[len];

        for (int block = 1; block < len; block *= 2) {
            for (int start = 0; start < len; start += 2 * block) {
                int low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = ((start + 2*block) < len) ? (start + 2*block) : len;

                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;
                int k = start;
                while (start1 < end1 && start2 < end2) {
                    result[k++] = (a[start1] < a[start2]) ? a[start1++] : a[start2++];
                }
                while (start1 < end1) {
                    result[k++] = a[start1++];
                }
                while (start2 < end2) {
                    result[k++] = a[start2++];
                }
            }
            int[] tmp = a;
            a = result;
            result = tmp;
        }
        result = a;
    }

    // from 维基百科
    public static void merge_sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int block, start;

        for (block = 1; block < len; block *= 2) {
            for (start = 0; start < len; start += 2 * block) {
                int low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = (start + 2 * block) < len ? (start + 2 * block) : len;
                //两个块的起始下标及结束下标
                int start1 = low, end1 = mid;
                int start2 = mid, end2 = high;
                //开始对两个block进行归并排序
                while (start1 < end1 && start2 < end2) {
                    result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
                }
                while (start1 < end1) {
                    result[low++] = arr[start1++];
                }
                while (start2 < end2) {
                    result[low++] = arr[start2++];
                }
            }
            int[] temp = arr;
            arr = result;
            result = temp;
        }
        result = arr;
    }



}
