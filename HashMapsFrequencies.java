// Given N array elements and Q queries. For every query find frequency of element in array.
// Input Format

// First line contains 2 integers N, M denoting size of the array and the number of queries.
// Second line contains the elements of the array.
// Third line contains M elements representin queries. 

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/levelup-18aug-frequencyqueries

import java.util.*;
public class HashMapsFrequencies{
     public static void FrequencyQueries(int[] arr,int[] queries) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : arr) {
            if(hm.containsKey(num)== true){
                int temp = hm.get(num);
                hm.put(num,temp+1);
            }else{
                hm.put(num,1);
            }
        }

        for (int num : queries) {
            if(hm.containsKey(num)== true){
                System.out.println(hm.get(num));
            }else{
                System.out.println(0);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int[] queries = new int[m];
        for(int i=0;i<m;i++){
            queries[i] = scn.nextInt();
        }
        
        FrequencyQueries(arr, queries); // Output: 3
    }
}
