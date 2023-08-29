// // You are given an array consisting of n integers where every element appears exactly twice, except for one element which appears exactly once. Duplicate Numbers are adjacent to each other.

// // Return the single element that appears only once.

// // Your solution must run in O(log n) time and O(1) space.

// // Leetcode Link: https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// // Input Format

// // First line contains integer n representing the length of array
// // Second line contains n integers
// // Constraints

// // 1 <= n <= 10^9
// // Output Format

// // Return the number appearing only once.
// // Sample Input 0

// // 15
// // 4 4 1 1 9 9 11 11 20 7 7 3 3 5 5
// // Sample Output 0

// // 20
// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-single-element-in-array

import java.io.*;
import java.util.*;

public class BinarySearchSingleElementArray {

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i<arr.length ; i++ ){
            arr[i] = sc.nextInt();
        } 
        int ans =   Single_Element_Present(arr);
        System.out.println(ans);
    }
  /* here we using Linear search but the the time complexcity is used O(N)! and we get the TC O(logN)> ):
    
  static void Single_Element_Present(int [] arr){
        if(arr[arr.length-1] != arr[arr.length-2]){
            System.out.println(arr[arr.length -1]);
        }
        for(int i = 0 ; i< arr.length-1 ; i= i+2){
            if(arr[i+1] != arr[i]){
                System.out.println(arr[i]);
                break;
            }
        }
    } */
    
//*here we are using binary search to get better time complexcity O(logN) :);here is the best optimezed code with O(logN)
    static int Single_Element_Present(int [] arr){
        if(arr[0] != arr[1]){ return arr[0];} //why >> upcoming condations the index out of bond
        if(arr[arr.length - 1] != arr[arr.length - 2]){return arr[arr.length - 1];} // same here!
      int  lowerIndex = 2; //why>> because we are check index 0 and 1;
      int  higherIndex = arr.length-3; // aslo we check last index and secondlast!
      int ans = 0; // if there are no one  element  appears return 0;
    
        while(lowerIndex <= higherIndex){
        int middleIndex = (lowerIndex + higherIndex)/2;  // here we are applying binary search 
        if(arr[middleIndex] != arr[middleIndex - 1] && arr[middleIndex] != arr[middleIndex + 1]){  // here the middle term check it true or not/
            return arr[middleIndex];
        }
        if(arr[middleIndex] == arr[middleIndex - 1]){// here the logic of even / or odd index **> we shift middle in even or odd pojection 
            middleIndex = middleIndex - 1;  
        }
        if(middleIndex %2 == 0){  
            lowerIndex = middleIndex + 2; // you can also used +1 
        }
         else{  higherIndex = middleIndex -1; }// <-- short cut -->also you can write this here if(m%2 == 1 { hi = m -1 })
     }  
    
return ans;
    } 
}