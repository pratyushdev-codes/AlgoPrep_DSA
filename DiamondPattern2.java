// Print this DiamondPattern2
// *** ***
// **   **
// *     *
// **   **
// *** ***
import java.util.*;
public class DiamondPattern2 {
 public static void main(String args[]) {

int n= 5;
        int nst = 3;
        int nsp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            for (int k = 1; k <= nsp; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= n / 2) {
                nst--;
                nsp += 2;
            } else {
                nst++;
                nsp -= 2;
            }
        }
    }
}