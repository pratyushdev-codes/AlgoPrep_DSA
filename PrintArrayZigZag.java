// Given a 2D array, Print integers in zig zag fashion.

// Note: Zig zag fashion means oth row from left to right, 1st row form right to left, 2nd row from left to right and so on 
// Input Format

// The first line contains two integers n and m representing row and column of 2D array.
// Each of next n rows contains m numbers of 2D array.

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-2d-array-print-zigzag

import java.util.*;
public class PrintArrayZigZag{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        // Call the function to print in zigzag fashion
        printZigZag(arr, n, m);
    }

    public static void printZigZag(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // Even rows (0-based index)
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else { // Odd rows
                for (int j = m - 1; j >= 0; j--) { // Print in reverse order
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}