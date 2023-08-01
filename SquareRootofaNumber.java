import java.util.Scanner;

public class SquareRootofaNumber {
     public static void main(String[] args) {
			
       
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int i = 1;
        int ans = 1;
        
        while(i*i<=n){
            ans = i;
            i++;
        }
        
        System.out.println(ans);
    }
}

