package com.algorithm.sliding_window.count_strictly_Increasing_subarrays;

public class Solution {
    static int countIncreasing(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] <= arr[j - 1]) {
                    break;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 2 };
        System.out.println();
        System.out.println(countIncreasing(arr));
    }
}
