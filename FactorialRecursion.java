// Take as input n

// Print n!
// Input Format

// Integer representing n

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-fact

import java.util.*;
public class FactorialRecursion{
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int ans = factorial(n);
        System.out.println(ans);
    }
    
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        
        int temp = factorial(n-1);
        return temp*n;
    }
}
