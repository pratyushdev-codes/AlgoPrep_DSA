//Given N elements, Rotate the array from last to first by K times (Google, meta, amazon)
import java.util.*;
public class RotatetheArraybyKTimes {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        
        k = k%n;
        reversePart(arr,0,n-1);
        reversePart(arr,0,k-1);
        reversePart(arr,k,n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void reversePart(int[]arr, int s, int e){
        int sp = s;
        int ep = e;
        while(sp < ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

    }
}

