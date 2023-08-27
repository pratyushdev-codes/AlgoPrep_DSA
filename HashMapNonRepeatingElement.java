// Find the first non-repeating element in a given array arr of N integers.
// GFG Link: https://practice.geeksforgeeks.org/problems/non-repeating-element3958/1

// Input Format

// The first line contains size of array.
// Second line contains the elements of the array.


// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/levelup-18aug-nonrepeatingelement

import java.util.*;
public class HashMapNonRepeatingElement{
    public static void main(String[] args) {
   public static int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            if(hm.containsKey(num)== true){
                int temp = hm.get(num);
                hm.put(num,temp+1);
            }else{
                hm.put(num,1);
            }
        }
        for (int num : arr) {
            if (hm.get(num) == 1) {
                return num;
            }
        }
        return -1; // If no non-repeating element is found
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(firstNonRepeating(arr)); // Output: 3
    }
}
