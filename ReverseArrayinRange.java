import java.util.*;
public class ReverseArrayinRange {
    public static void main(String[] args) {
        int arr[]={12,17373,82828,8593,193,873,673};
        

        int sp=arr[2];
        int ep=arr[5]-1;
        while(sp<ep){
            int temp=arr[sp];
            arr[sp]=arr[ep];
            arr[ep]=temp;
            sp++;
            ep--;
        }
        for(int i=1;i<arr.length-1;i++){
                   System.out.print(" "+ arr[i]);
        }
       
        
    }
    
}
