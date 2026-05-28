package com.algorithm.recursion.learn;

public class Learn {

    // static void print(int n) {
    // if (n < 1) {
    // return;
    // }

    // print(n - 1);
    // System.out.print(n + " ");
    // }

    // static int sum(int n) {

    // if (n < 2) {
    // return 1;
    // }

    // return n + sum(n - 1);
    // }

    // static int factorial(int n) {
    // if (n == 1)
    // return 1;

    // return n * factorial(n - 1);
    // }

    // 0 1 1 2 3 5 8 13 21 34

    // static int fibonacci(int n) {
    // if (n <= 2) {
    // return n - 1;
    // }
    // return fibonacci(n - 1) + fibonacci(n - 2);
    // }

    // static void printEven(int n) {
    // if (n == 0) {
    // System.out.print(n + " ");
    // return;
    // }

    // printEven(n - 1);
    // if (n % 2 == 0) {
    // System.out.print(n + " ");
    // }
    // }

    // static void printEven(int n) {
    // if (n % 2 != 0) {
    // n--;
    // }

    // if (n == 0) {
    // System.out.print(n + " ");
    // return;
    // }

    // printEven(n - 2);
    // System.out.print(n + " ");
    // }
    // static int power(int x, int y) {
    // if (y == 1) {
    // return x;
    // }

    // return x * power(x, y - 1);
    // }

    // 12 / 10 = 1
    // 1/ 10 = 0

    // static int countDigits(int number) {
    // if (number < 10) {
    // return 1;
    // }

    // return 1 + countDigits(number / 10);
    // }

    // static int sumDigits(int number) {
    // if (number < 10) {
    // return number;
    // }

    // return (number % 10) + sumDigits(number / 10);
    // }

    // static int reverseDigits(int number) {
    // if (number < 10) {
    // return number;
    // }

    // int digit = number % 10;
    // int mutiple = 1;
    // int temp = number / 10;
    // while (temp > 0) {
    // mutiple *= 10;
    // temp /= 10;
    // }

    // return digit * mutiple + reverseDigits(number / 10);
    // }

    // static boolean isPalindrome(int n) {
    // return n == reverseDigits(n);
    // }

    // static int countZeros(int number) {
    // if (number < 10) {
    // return 0;
    // }

    // return (number % 10 == 0 ? 1 : 0) + countZeros(number / 10);
    // }

    // static void printStr(String str) {
    // if (str.equals("")) {
    // return;
    // }

    // System.out.print(str.charAt(0) + " ");
    // printStr(str.substring(1));
    // }

    // static String reverseString(String str) {
    // if (str == null || str.length() <= 1) {
    // return str;
    // }

    // char lastChar = str.charAt(str.length() - 1);
    // String remainingStr = str.substring(0, str.length() - 1);

    // return lastChar + reverseString(remainingStr);
    // }

    // static boolean isPalindromeStr(String str) {
    // return str.equals(reverseString(str));
    // }

    // static boolean isPalindromeStr(String str) {
    // if (str == null || str.length() <= 1) {
    // return true;
    // }

    // char firstChar = str.charAt(0);
    // char lastChar = str.charAt(str.length() - 1);

    // if (firstChar != lastChar) {
    // return false;
    // }

    // String middleString = str.substring(1, str.length() - 1);

    // return isPalindromeStr(middleString);
    // }

    // static int countLetter(String str, char letter) {
    // if (str == null || str.length() <= 0) {
    // return 0;
    // }

    // return (str.charAt(0) == letter ? 1 : 0) + countLetter(str.substring(1),
    // letter);
    // }

    // static String removeSpaces(String str) {
    // if (str == null || str.length() <= 1) {
    // return str;
    // }
    // char firstChar = str.charAt(0);
    // if (firstChar == ' ') {
    // return removeSpaces(str.substring(1));
    // }

    // return firstChar + removeSpaces(str.substring(1));

    // }

    // static String addNumberToCharacter(String str) {
    // if (str == null || str.length() <= 0) {
    // return str;
    // }

    // char lastChar = str.charAt(str.length() - 1);
    // int number = str.length();

    // return addNumber(str.substring(0, str.length() - 1)) + lastChar + number;

    // }

    // static String removeDuplicate(String str) {
    // if (str == null || str.length() <= 1) {
    // return str;
    // }

    // char firstChar = str.charAt(0);
    // char secondChar = str.charAt(1);
    // if (firstChar == secondChar) {
    // return removeDuplicate(str.substring(1));
    // }

    // return firstChar + removeDuplicate(str.substring(1));
    // }
    public static void main(String args[]) {
        System.out.println();
        // System.out.println(countDigits(1234));
        // System.out.println(sumDigits(1234));
        // System.out.println(isPalindrome(12321));
        // System.out.println(countZeros(12000));
        // printStr("nam");
        // System.out.println(isPalindromeStr("1231"));
        // System.out.println(countLetter("abcabcasfasasad", 'a'));
        // System.out.println(removeSpaces("a b c d e"));
        // System.out.println(removeDuplicate("aaaaaaaaaaaaabbbbbbbbbbbbbdddddddddddddccccccccccccc"));
        System.out.println();
    }
}
