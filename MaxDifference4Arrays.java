// Given n length array "arr". Find (i,j) with maximum value of (abs(arr[i] - arr[j]) + i - j). You need to print max value of (abs(arr[i] - arr[j]) + i - j) possible and not the (i,j) itself.

// Note 1: abs represents the postive part only. ex: abs(8) = 8 and abs(-8) = 8.

// Note 2: Doing it by checking all the possible pairs. Works but can you do something smart?

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-arrays2-max-difference-4-hw

import java.util.Scanner;

public class MaxDifference4Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int currentValue = Math.abs(arr[i] - arr[j]) + i - j;
                if (currentValue > max) {
                    max = currentValue;
                }
            }
        }
        
        int ans1 = maxDifference2(arr);
        int ans2 = maxDifference3(arr);
        
        System.out.println(Math.max(max, Math.max(ans1, ans2)));
    }

    public static int maxDifference3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - i;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + i;
        }
        
        return max - min;
    }

    public static int maxDifference2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + i;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - i;
        }
        
        return max - min;
    }
}
