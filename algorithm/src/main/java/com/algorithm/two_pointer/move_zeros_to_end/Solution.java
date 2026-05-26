package com.algorithm.two_pointer.move_zeros_to_end;

public class Solution {
  public static void pushZerosToEnd(int[] arr) {
    // code here
    int j = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        arr[j] = arr[i];
        j++;
      }
    }
    while (j < arr.length) {
      arr[j] = 0;
      j++;
    }
  }

  public static void main(String args[]) {
    int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
    pushZerosToEnd(arr);

    for (int num : arr) {
      System.out.print(num + " ");
    }
  }
}

// Output
// 1 2 4 3 5 0 0 0
