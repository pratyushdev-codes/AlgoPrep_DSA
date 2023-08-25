// Given n length array "arr". Find (i,j) with maximum value of arr[i] - arr[j] + j - i. You need to print max value of (arr[i] - arr[j] + j - i) possible and not the (i,j) itself.

// Note: Doing it by checking all the possible pairs. Works but can you do something smart?

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-arrays2-max-difference-3-hw

import java.util.*;

public class MaxDifference2Arrays{
    public static void main(String[] args) {
        
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        System.out.println(maxdifference_1(arr));
       
    }
    
    public static int maxdifference_1(int[]arr){
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] - i;
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            if(arr[i] < min){
                min = arr[i];
            }
            
        }
        
        return max - min;
    }
}
