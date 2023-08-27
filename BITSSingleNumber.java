// Given a array of integers, every element appears twice except for one. Find that single one.

// Leetcode link: https://leetcode.com/problems/single-number/
// Input Format

// First line contains the size of the array
// Second line contains the elements of the array

// Leetcode link: https://leetcode.com/problems/single-number/

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/levelup-bits1-singlenumber

import java.util.*;
public class BITSSingleNumber{
      public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int xor = 0;
        for(int i=0;i<n;i++){
            xor = xor^arr[i];
        }
        
        System.out.println(xor);
    }
}
