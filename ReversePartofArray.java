// Given n length Array and two valid index [s,e], You have to Reverse the array from s to e and print the final array.
import java.util.*;
public class ReversePartofArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) { // Start the loop from 0
            arr[i] = sc.nextInt();
        }

        int sp = sc.nextInt() ;// Starting index
        int ep = sc.nextInt(); // Ending index

        // Perform reverse only within the specified range [sp, ep]
        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print the reversed array
        }
    }
}