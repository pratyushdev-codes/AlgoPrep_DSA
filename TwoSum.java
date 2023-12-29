import java.util.*;
public class TwoSum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int nums[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target= sc.nextInt();

        
        
    }public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){

            for(int j=i+1;i<nums.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }





        }





    }
}