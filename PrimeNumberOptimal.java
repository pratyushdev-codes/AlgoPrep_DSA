import java.util.*;

public class PrimeNumberOptimal {
     public static void main(String args[] ) throws Exception {
          Scanner scn = new Scanner(System.in);
        //System.out.println("enter a number");
        int n = scn.nextInt();
        int count = 0;
        for(int i =1;i*i<=n;i++){
            if(n%i==0){
		if(i != n/i){count = count+2;}
		else{count++;}
}
        }

        
        if(count == 2){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not a Prime Number");
        }

    }
}
