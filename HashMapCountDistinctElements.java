// Given an array arr[] of length N, The task is to count all distinct elements in arr[].
// Input Format

// The first line contains size of array.
// Second line contains the elements of the array.
// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/levelup-18aug-countdistinctelements

import java.util.*;
public class HashMapCountDistinctElements{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        System.out.println(countDistinct(arr));
    }
    public static int countDistinct(int[] arr){
        int n = arr.length;
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            // add all the elements to the HashSet
            hs.add(arr[i]);
        }

        // return the size of hashset as
        // it consists of all Unique elements
        return hs.size();
    }

}
