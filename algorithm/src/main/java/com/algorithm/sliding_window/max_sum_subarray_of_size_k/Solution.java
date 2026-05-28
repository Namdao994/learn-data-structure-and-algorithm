package com.algorithm.sliding_window.max_sum_subarray_of_size_k;

public class Solution {
    // brute force
    // static int maxSum(int arr[], int n, int k) {
    // int maxSum = Integer.MIN_VALUE;
    // for (int i = 0; i <= n - k; i++) {
    // int sum = 0;

    // for (int j = i; j < i + k; j++) {
    // sum += arr[j];
    // }

    // maxSum = Math.max(maxSum, sum);
    // }
    // return maxSum;
    // }

    static int maxSum(int arr[], int n, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int currentSum = windowSum;
        for (int i = k; i < n; i++) {

            currentSum = currentSum + arr[i] - arr[i - k];

            windowSum = Math.max(currentSum, windowSum);
        }

        return windowSum;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, -1, 0, 3 };
        int k = 3;
        int n = arr.length;
        System.out.println();
        System.out.println(maxSum(arr, n, k));
    }
}
