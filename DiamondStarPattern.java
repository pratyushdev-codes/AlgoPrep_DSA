// Print this pattern
//    *
//   ***
//  *****
//   ***
//    *


public class DiamondStarPattern {
    public static void main(String[] args) {
        int n = 7;
        int nst = 1;
        int nsp = n / 2;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= nst; k++) {
                System.out.print("*");
            }

            // Move to the next line
            

            if (i < n / 2) {
                nsp--;
                nst = nst + 2;
            } else {
                nsp++;
                nst = nst - 2;
            }System.out.println();
        }
    }
}
