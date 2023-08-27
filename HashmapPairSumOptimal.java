// Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.
// GFG Link: https://practice.geeksforgeeks.org/problems/key-pair5616/1

// Input Format

// The first line contains size of array and required sum
// Second line contains the elements of the array.

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/levelup-18aug-pairsum

import java.util.*;
public class HashmapPairSumOptimal{
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        if(PairSum(arr,k) == true){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }

    }
    
     public static boolean PairSum(int[] arr, int k) {
         int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            if(map.containsKey(num) == true){
                int temp = map.get(num);
                map.put(num,temp+1);
            }else{
                map.put(num,1);
            }
        }

        for(int i=0;i<n;i++){
            int a = arr[i];
            int b = k - a;
            
            if((a != b) && (map.containsKey(b)==true)){
                return true;
            }else if((a == b) && (map.get(b) > 1)){
                return true;
            }
        }
         
         return false;
    }
}