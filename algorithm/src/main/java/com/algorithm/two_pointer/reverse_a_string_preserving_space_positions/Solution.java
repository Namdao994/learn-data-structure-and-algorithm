package com.algorithm.two_pointer.reverse_a_string_preserving_space_positions;

public class Solution {

  public static String preserveSpace(String str) {

    int left = 0;
    int right = str.length() - 1;
    char[] arr = str.toCharArray();
    while (left < right) {
      if (arr[left] == ' ') {
        left++;
      } else if (arr[right] == ' ') {
        right--;
      } else {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
      }
    }
    return new String(arr);
  }

  public static void main(String[] args) {
    String s = "internship at geeks for geeks";
    System.out.println(preserveSpace(s));
  }
}
