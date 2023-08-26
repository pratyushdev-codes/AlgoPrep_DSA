// Given N length Array, at every step remove an array element. Cost to remove element = sum of array elements present. Find min cost to remove all the elements.

// Note: Add to cost first and then remove.
// Input Format

// Integer representing N representing length of array
// N numbers of Array

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-sorting-order-of-removal
import java.util.*;
public class OrderofRemoval{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
          int ans= orderofRemoval(arr);
        System.out.println(ans);
      
    }
        public static int orderofRemoval( int arr[]){
            int n=arr.length;
            int ans =0;
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                int temp =arr[i]*(n-i);
                ans =ans+temp;
            }
            return ans;
        }
    }

