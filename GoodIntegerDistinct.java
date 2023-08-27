// Given N array Integers, Calculate number of good integers. An element is said to be good integers, if {No. of element < element == element itself}

// Note: Array elements are distinct.
// Input Format

// Integer representing N representing length of array
// N numbers of Array

// https://www.hackerrank.com/contests/interview-prep-cohort-1/challenges/found-sorting-good-integer-distinct

import java.util.*;
public class GoodIntegerDistinct{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = GoodIntegerDistinct(arr);
        System.out.println(result);

        
    }public static int GoodIntegerDistinct(int arr[]){
             Arrays.sort(arr);
                int n=arr.length;
                int ans =0;
                int lesscount=0;

                if(arr[0] == 0){
                    ans++;
                }
        
                for(int i=1;i<arr.length;i++){
                    if(arr[i] != arr[i-1]){
                        lesscount = i;
                    }
                    if(arr[i] == lesscount){
                        ans++;
                    }
                }
                return ans;        
             }
    }
