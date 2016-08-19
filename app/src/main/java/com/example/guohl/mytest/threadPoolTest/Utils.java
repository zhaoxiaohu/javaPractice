package com.example.guohl.mytest.threadPoolTest;

import java.util.Date;
import java.util.Vector;

/**
 * Created by guohl on 2016/8/18.
 */
public class Utils {
    public static void printTheadInfo() {
        System.out.print("thread Id: " + Thread.currentThread().getId() + " ");
    }

    public static void printTheadInfo(int index) {
        System.out.print("\r\nthread Id: " + Thread.currentThread().getId() + " index: " + index);
    }

    public static void main(String[] args) {
        System.out.print("\r\ntime: " + new Date().getTime());
    }

    Vector vector;
}
