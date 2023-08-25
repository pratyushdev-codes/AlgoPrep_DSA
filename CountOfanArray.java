
//Given N array elements , count total number of elements having 1 atleast element greater than itself.
import java.util.*;

public class CountOfanArray {
      public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
    
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == max){
                count++;
            }
        }
        
        System.out.println(n - count);
    }
}
