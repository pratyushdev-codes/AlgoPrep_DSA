
// Take as input a number n.  
// Print the nth number of Fibonacci sequence where  
// 0th Fibonacci is 0 and 1st Fibonacci is 1. Here is a sample  
// 0 1 1 2 3 5 8 13 21 34 55

// Leetcode Link: https://leetcode.com/problems/fibonacci-number/
// Input Format

// Integer


// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-fibonacci-number


import java.io.*;
import java.util.*;

public class FibonacciResursion{
    
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int ans = fibonacci(n);
        System.out.println(ans);
    }
    
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        
        int temp1 = fibonacci(n-1);
        int temp2 = fibonacci(n-2);
        return temp1 + temp2;
    }
}
