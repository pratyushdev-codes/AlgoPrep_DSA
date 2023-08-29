// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-binary-search-floor-in-an-array

// Given a sorted array of n integers and a number k, Return floor(k).
// Input Format

// First line contains integer n representing the length of array
// Second line contains n integers
// Third line contains integer k
// Constraints

// 1 <= n <= 10^9
// Output Format

// Return floor of k.
import java.util.*;
public class BinarySearchFloor{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
       
        
        System.out.println(BinarySearchfloor(arr, k));
    }public static int BinarySearchfloor(int [] arr, int k){
         int low=0;
         int high=arr.length-1;
         int ans=Integer.MAX_VALUE;

         while(low<=high){
            int mid=( high+low)/2;
                     if(k==arr[mid]){
                        return k;
                     }else if(arr[mid]<k){
                        ans = arr[mid];
                        low=mid+1;


                     }else{
                        high = mid -1 ;
                     }
         }
         return ans;
    }
}