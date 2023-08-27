
// Take as input N

// Print numbers from N to 1 in N lines
// Input Format

// Integer representing n

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-print-decreasing-hw

import java.util.*;
public class PrintDecreasing{
    public static void main(String[] args) {
    
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        dec(n);
        
    }
    
    public static void dec(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        
        
        System.out.println(n);
        dec(n-1);
    }
}
