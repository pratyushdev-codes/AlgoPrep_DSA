// Given an integer array nums of size N, rotate the array to the right by k steps, where k is non-negative.

// Leetcode Link: https://leetcode.com/problems/rotate-array/ 
import java.util.*;
public class RotateArrayKtimes {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of K");
        int k = sc.nextInt();
        k = k % n;
        reversePart(arr, 0, n - 1);
        reversePart(arr, 0, k - 1);
        reversePart(arr, k, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void reversePart(int[] arr, int start, int end) {
        int s = start;
        int e = end;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}