package com.algorithm.two_pointer.two_sum;

import java.util.Arrays;

public class Solution {
    static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int sum = arr[left] + arr[right];
        while (left < right) {
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;

        if (twoSum(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
