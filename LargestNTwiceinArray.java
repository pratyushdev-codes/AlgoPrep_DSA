import java.util.*;

public class LargestNTwiceinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; // Initialize the array with the correct size

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = largestNTwiceinArray(arr);
        System.out.println(result);
    }
    public static int largestNTwiceinArray(int[] arr) {
        int n = arr.length;
        int count = 0;
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update the max element if a larger element is found
                count = 1;    // Reset the count to 1 since we found a new maximum
            } else if (arr[i] == max) {
                count++;      // Increment count if we encounter an element equal to the current maximum
            }
        }

        if (count >= 2) {
            return 1; // Return 1 if count is greater than or equal to 2 (condition true)
        } else {
            return -1; // Return -1 otherwise (condition false)
        }
    }
}
