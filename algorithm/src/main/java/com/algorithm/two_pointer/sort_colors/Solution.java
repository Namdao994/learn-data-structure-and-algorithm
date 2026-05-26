package com.algorithm.two_pointer.sort_colors;

public class Solution {
    static void sort012(int[] arr) {

    }

    public static void main(String agrs[]) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        int n = arr.length;

        // sort the array in-place
        sort012(arr);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
