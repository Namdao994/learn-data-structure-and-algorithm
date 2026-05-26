package com.algorithm.two_pointer.unique_element_in_sorted_array;

import java.util.ArrayList;

public class Solution {

  static int removeDuplicates(int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();

    if (arr.length == 0) {
      return 0;
    }

    result.add(arr[0]);

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        result.add(arr[i]);
      }
    }
    return result.size();
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
    int newSize = removeDuplicates(arr);

    for (int i = 0; i < newSize; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
