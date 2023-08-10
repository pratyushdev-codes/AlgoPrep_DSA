
//Given N array elements , count total number of elements having 1 atleast element greater than itself.
import java.util.*;

public class CountOfanArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int [n];
       for(int i =1;i<n;i++){
          arr[i] =sc.nextInt();
       }

       int ans= countGreater(arr);
       System.out.println(ans);

    }public static int countGreater(int arr[]){
        int max= arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==max){
                count++;
            }
        }
        return arr.length-count;
    }
    
}
