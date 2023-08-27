// Take an input N, the size of array.
// Take N more inputs and store that in an array.

// 1.It reads a number N.
// 2.Take Another N numbers as input and store them in an Array.
// 3.It reads a Number M.

// Write a recursive function which returns the first index at which M is found in
// the array and -1 if M is not found anywhere.

// print returned value.


// Example(To be used only for expected output):
// Input:
// 4
// 2 8 6 4 
// 5
// Output:
// -1

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-first-index-hw

import java.util.*;

public class RecursionFirstIndex{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int m = scanner.nextInt();
        
        int index = findIndex(arr, n, m, 0);
        System.out.println(index);
    }

    public static int findIndex(int[] arr, int n, int m, int currentIndex) {
        if (currentIndex == n) {
            return -1; // Element not found
        }
        
        if (arr[currentIndex] == m) {
            return currentIndex; // Element found at currentIndex
        }
        
        return findIndex(arr, n, m, currentIndex + 1);
    }
}