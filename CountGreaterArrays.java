// Print a single Integer representing total no. of elements in the array having atleast 1 element greater than itself.
import java.util.*;
public class CountGreaterArrays{
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
