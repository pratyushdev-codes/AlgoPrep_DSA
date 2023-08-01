// 1281. Subtract the Product and Sum of Digits of an Integer
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
import java.util.*;

public class DifferenceofProductandSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int Sumofdigits = 0;
        int Productofdigits = 1;

        while (n > 0) {
            int lastdigit = n % 10;
            Sumofdigits = lastdigit + Sumofdigits;
            Productofdigits = lastdigit * Productofdigits;
            n = n / 10;
        }

        int DifferenceofProductandSum = Productofdigits - Sumofdigits;
        System.out.println(DifferenceofProductandSum);
    }
}

