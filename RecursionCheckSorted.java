// Take an input N, the size of array.
// Take N more inputs and store that in an array.

// 1.It reads a number N.
// 2.Take Another N numbers as input and store them in an Array.

// Write a recursive function which returns true if the array is sorted and false
// otherwise

// print returned value.


// Example(To be used only for expected output):
// Input:
// 4
// 2 8 6 4
// Output:
// false
// Input Format

// Integer representing N representing length of array
// N numbers of Array


// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-check-sorted

import java.util.*;
public class RecursionCheckSorted{
  
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean isSorted = isSortedArray(arr, n);
        System.out.println(isSorted);
    }

    public static boolean isSortedArray(int[] arr, int n) {
        if (n <= 1) {
            return true;
        }
        
        if (arr[n - 1] < arr[n - 2]) {
            return false;
        }
        
        return isSortedArray(arr, n - 1);
    }
}