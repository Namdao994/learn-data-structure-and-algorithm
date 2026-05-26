Closest Pairs Sum in Two Sorted Arrays
Last Updated : 11 Apr, 2026
Given two arrays a[] and b[], and a positive integer x, find a pair (a[i], b[j]) such that the sum of a[i] and b[j] is closest to x, in other words the absolute difference |a[i] + b[j] - x| is minimized.

Example: 

Input:  a[] = [1, 4, 5, 7], b[] = [10, 20, 30, 40], x = 32
Output:  [1, 30]
Explanation: The pair (1, 30) gives sum 31, which is closest to 32 (minimum difference = 1).

Input:  a[] = [1, 4, 5, 7], b[] = [10, 20, 30, 40], x = 50      
Output:  [7, 40]
Explanation: The pair (7, 40) gives sum 47, which is closest to 50 (minimum difference = 3).