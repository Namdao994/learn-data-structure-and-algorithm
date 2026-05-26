package com.algorithm.two_pointer.remove_element;

import java.util.ArrayList;

public class Solution {
  
  public static int removeElement(ArrayList<Integer> arr, int ele) {
    int k = 0;
    for(int i = 0; i < arr.size(); i++) {
      if(arr.get(i) != ele) {
        arr.set(k, arr.get(i));
        k++;
      }
    }
    return k;
  } 

  public static void main(String[] args) {
ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(0);
        arr.add(2);
        arr.add(2);
        arr.add(4);
        arr.add(2);
        int ele = 2;
        System.out.println(removeElement(arr, ele));
  }
}
