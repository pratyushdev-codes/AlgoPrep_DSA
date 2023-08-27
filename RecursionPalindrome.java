// Take as input String.

// Write a Function to Check whether it is palindrome or not. if yes print true
// otherwise false. Palindrome means string and it's reversed form are same

// please Note: Lower and Upper case letter treated as equal. You have to use recursion to solve the problem.


// Example:

// Input:
// aBcba

// output
// true


// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-recursion-ispalindrome

import java.util.*;
public class RecursionPalindrome{
       public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String st = scn.nextLine();
        System.out.println(IsPalin(st,0,st.length()-1));
    }
    
    public static boolean IsPalin(String st, int s, int e){
        if(s >= e){
            return true;
        }
        
        if(st.charAt(s)==st.charAt(e)){
            boolean temp = IsPalin(st,s+1,e-1);
            return temp;
        }else{
            return false;
        }
    }
}
