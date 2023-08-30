import java.util.*;
public class SwapArray{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sp = sc.nextInt();
        int ep = sc.nextInt();
        
        SwapArr(arr, sp, ep);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void SwapArr(int[] arr, int sp, int ep) {
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;  // Increment sp
            ep--;  // Decrement ep
        }
    }
}
