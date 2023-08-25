// Given n length array "arr" and an integer k, Check if there exists a pair(i,j) such that arr[i]+arr[j] == k and i!=j


import java.util.*;

public class TwoSumArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(twoSum(arr, k));
    }

    public static boolean twoSum(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] + arr[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
