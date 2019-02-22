package com.company;

public class Helpers {

    public static long factorial(int n) {
        if (n == 0) // Base case
            return 1;
        else
            return n * factorial(n - 1); // Recursive call
    }

    // factorial that calls itself
    public static long factorial2(int n) {
        return n * factorial2(n - 1);
    }

    public static long fib(long index) {
         if (index == 0) // Base case
            return 0;
         else if (index == 1) // Base case
             return 1;
        else // Reduction and recursive calls
            return fib(index - 1) + fib(index - 2);
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) // Base case
            return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) // Base case
            return false;
        else
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static int recursiveBinarySearch(int[] list, int key) {
         int low = 0;
         int high = list.length - 1;
         return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        if (low > high) // The list has been exhausted without a match
            return -low - 1;

        int mid = (low + high) / 2;
        if (key < list[mid])
             return recursiveBinarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
             return mid;
        else
         return recursiveBinarySearch(list, key, mid + 1, high);
    }

}
