//Printing the sum of every element of an Array.
import java.util.*;

public class SumofArray {
 public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] = new int[n];
        
        for (int i = 0;i<arr.length ;++i){
            System.out.print("Enter the number of elements in an array:");
            arr[i]=sc.nextInt();


        
    } int sum=0;
    for(int i=0;i<n;i++){
                    sum=sum+arr[i];
           
           
    }System.out.println(sum);
    
}
}