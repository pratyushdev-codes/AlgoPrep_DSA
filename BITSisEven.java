// Take as input a number n. Determine whether it is even or odd. If it is even, 
// print "even" otherwise print "odd".

// Note: Using any mathematical operator is not allowed.
// Input Format

// The only line contains an Integer N.
// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-bits-iseven

import java.util.*;
public class BITSisEven{
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        if((n & 1) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
