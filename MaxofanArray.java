import java.util.Scanner;

public class MaxofanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0]; // Initialize max with the first element of the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element of the array: " + max);
    }
}
