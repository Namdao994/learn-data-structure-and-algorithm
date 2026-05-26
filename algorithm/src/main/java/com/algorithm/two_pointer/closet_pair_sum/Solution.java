package com.algorithm.two_pointer.closet_pair_sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    static ArrayList<Integer> sumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        ArrayList<Integer> result = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            int currentDiff = Math.abs(sum - target);
            if (minDiff > currentDiff) {
                minDiff = currentDiff;
                result = new ArrayList<>(Arrays.asList(arr[left], arr[right]));
            }
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new ArrayList<>(Arrays.asList(arr[left], arr[right]));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 7, 1, 4 };
        int target = 10;

        ArrayList<Integer> res = sumClosest(arr, target);
        if (!res.isEmpty())
            System.out.println(res.get(0) + " " + res.get(1));
    }
}
