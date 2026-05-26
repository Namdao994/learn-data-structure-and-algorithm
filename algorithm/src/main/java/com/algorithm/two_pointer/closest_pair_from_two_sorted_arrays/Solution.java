package com.algorithm.two_pointer.closest_pair_from_two_sorted_arrays;

public class Solution {
    static int[] findClosestPair(int[] a, int[] b, int x) {
        int[] result = new int[2];
        int i = 0;
        int j = b.length - 1;
        int minDiff = Integer.MAX_VALUE;
        while (i < a.length && j >= 0) {
            int sum = a[i] + b[j];
            int currentDiff = Math.abs(sum - x);

            if (minDiff > currentDiff) {
                minDiff = currentDiff;
                result[0] = a[i];
                result[1] = b[j];
            }

            if (sum < x) {
                i++;
            } else if (sum > x) {
                j--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = { 1, 4, 5, 7 };
        int[] b = { 10, 20, 30, 40 };
        int x = 38;

        int[] ans = findClosestPair(a, b, x);
        System.out.println("[" + ans[0] + ", " + ans[1] + "]");
    }
}
