import java.util.Arrays;

public class FibonacciNumberDP {
    public static void main(String[] args) {
        int n = 10; // Example: Calculate the 10th Fibonacci number
        int result = fib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static int fib(int n) {
        //Make a seperate function for DP
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return findHelper(n, dp);
    }

    public static int findHelper(int n, int[] dp) {
        //You need to create a new function for main recursive code.
        if (n == 0 || n == 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int a = findHelper(n - 1, dp);
        int b = findHelper(n - 2, dp);

        dp[n] = a + b;
        return dp[n];
    }
}
