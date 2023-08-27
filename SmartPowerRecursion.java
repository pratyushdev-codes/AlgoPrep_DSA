// Given two Integer a and n, find a^n (a raise to power n).

// Note: Use Recursion and Expected Time complexity is O(logN).

// Leetcode Link: https://leetcode.com/problems/powx-n/
// Input Format

// Single line contains 2 integers a and n
// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/smart-power


import java.util.*;
public class SmartPowerRecursion{
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int n = scn.nextInt();
        
        System.out.println(power(a,n));
    }
    
    public static long power (int a, int n){
     if (n == 1){
       return a;
     }
        
     long temp = power(a,n/2);
      if(n%2 == 0){
        return temp*temp;
      }else{
        return temp*temp*a;
      }
   }
   
}
