// Printing the numbers entered by the user in an array.


import java.util.*;
public class Arrays {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr [] = new int[n];
        
        for (int i = 0;i<arr.length ;++i){
            arr[i]=sc.nextInt();

    } 
    for(int i=0;i<n;i++){
                    System.out.println(arr[i]);
           
           
    }
}
}