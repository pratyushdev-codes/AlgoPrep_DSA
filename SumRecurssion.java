

import java.util.*;
public class SumRecurssion{
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int ans = sum(n);
        System.out.println(ans);
    }
    
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        
        int temp = sum(n-1);
        return temp + n;
    }
}
