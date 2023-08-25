// Given n length array "arr". Find (i,j) with maximum value of arr[i] - arr[j] + i - j. You need to print max value of (arr[i] - arr[j] + i - j) possible and not the (i,j) itself.

// Note: Doing it by checking all the possible pairs. Works but can you do something smart?



import java.util.*;
public class MaxDifferenceArrays{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxDifference(arr));
    }

    public static int maxDifference(int[] arr) {
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
        
        return max - min;
    }
}