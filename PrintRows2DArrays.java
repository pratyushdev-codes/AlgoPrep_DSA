// Given a 2D array, Print row wise integers.


// The first line contains two integers n and m representing row and column of 2D array.
// Each of next n rows contains m numbers of 2D array.

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-2d-array-print-row-wise

import java.util.*;
public class PrintRows2DArrays{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
