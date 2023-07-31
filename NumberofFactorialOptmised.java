
// Printing prime numbers- Optimized solution, Factors of a number can also be 
import java.util.*;

public class NumberofFactorialOptmised {
    public static void main(String args[]) throws Exception {
        Scanner scn = new Scanner(System.in);
        // System.out.println("enter a number");
        int n = scn.nextInt();
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    count = count + 2;
                } else {
                    count++;
                }

            }
        }

        System.out.println(count);
    }
}
