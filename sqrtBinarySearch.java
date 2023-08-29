// Given a non-negative integer n, return the square root of x rounded down to the nearest integer.You must not use any built-in exponent function.

// Your solution must run in O(log n) time and O(1) space.

// Leetcode Link: https://leetcode.com/problems/sqrtx/

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-binary-search-sqrt-hw
import java.util.*;
public class sqrtBinarySearch{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      
        int x=sc.nextInt();
    }public int mySqrt(int x) {
        long low =  0;
        long high = x;
        long ans = 0;
        while(low <= high){
            long mid = (low+high)/2;
            if(mid*mid < x){
                low = mid + 1;
                ans = mid;
            }
            else if(mid*mid > x){
                high = mid - 1;
            }
            else{
                return (int)mid;
            }
        }
        return (int)ans;
    }
}
