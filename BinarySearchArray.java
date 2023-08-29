
// Given a sorted array of n integers and a number k, Return true if k is present otherwise return false.
// Input Format

// First line contains integer n representing the length of array
// Second line contains n integers
// Third line contains integer k
// Constraints

// 1 <= n <= 10^9
// Output Format

// Return true if k is present else false.

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-binary-search-search-in-array

import java.util.*;
public class BinarySearchArray{
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
    }
    int k=sc.nextInt();
    System.out.println(BinarySearch(arr,k));

   }public static boolean BinarySearch(int arr[], int k){
    int lo=0;
    int hi=arr.length-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]==k){
            return true;
        }else if(arr[mid]<k){
            lo=mid+1;

        }else{
            hi=mid-1;
        }
    }
    return false;
   }
}