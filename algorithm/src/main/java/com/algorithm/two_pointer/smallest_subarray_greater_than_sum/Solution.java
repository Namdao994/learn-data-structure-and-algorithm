package com.algorithm.two_pointer.smallest_subarray_greater_than_sum;

public class Solution {

  // Brute force
  // static int smallestSubWithSum(int x, int[] arr) {

  // int result = Integer.MAX_VALUE;
  // for (int i = 0; i < arr.length; i++) {
  // int sum = 0;
  // for (int j = i; j < arr.length; j++) {
  // sum += arr[j];

  // if (sum > x) {
  // result = Math.min(result, j - i + 1);
  // break;
  // }
  // }

  // }
  // if (result == Integer.MAX_VALUE)
  // return 0;
  // return result;
  // }

  // static int smallestSubWithSum(int x, int[] arr) {

  // int left = 0;
  // int sum = 0;
  // int result = Integer.MAX_VALUE;
  // for (int right = 0; right < arr.length; right++) {
  // sum += arr[right];
  // if (sum > x) {
  // result = Math.min(result, right - left);
  // left++;
  // sum = 0;
  // }
  // }
  // return result;
  // }

  static int smallestSubWithSum(int x, int[] arr) {

    int minLength = Integer.MAX_VALUE;

    int left = 0;
    int sum = 0;

    for (int right = 0; right < arr.length; right++) {

      sum += arr[right];

      while (sum > x) {

        minLength = Math.min(
            minLength,
            right - left + 1);

        sum -= arr[left];
        left++;
      }
    }

    return minLength == Integer.MAX_VALUE
        ? 0
        : minLength;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 4, 45, 6, 10, 19 };
    int x = 51;

    System.out.println(smallestSubWithSum(x, arr));
  }
}
