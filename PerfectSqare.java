// Given a positive integer num, return true if num is a perfect square or false otherwise.

// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

// You must not use any built-in library function, such as sqrt.


import java.util.*;
public class PerfectSqare {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPerfectSquare = isPerfectSquare(n);
        System.out.println(isPerfectSquare);
    }
    public static boolean isPerfectSquare(int n) {
        int i = 1;
        int ans = 1;

        while (i * i <= n) {
            ans = i;
            i++;
        }
        return ans * ans == n;
    }
}

