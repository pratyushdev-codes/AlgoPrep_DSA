

import java.util.*;

public class PrefixSum{
    public static void main(String[] args) { Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int[] prefixSums = prefixSum(arr);

    // Printing prefix sums
    for(int i = 0; i < n; i++) {
        System.out.print(prefixSums[i] + " ");
    }
        
    }
   
    public static int[] prefixSum(int[] arr) {
        int n = arr.length;
        int[] pf = new int[n];
        pf[0] = arr[0];

        for(int i = 1; i < n; i++) {
            pf[i] = pf[i - 1] + arr[i];
        }

        return pf;
    }
    }
