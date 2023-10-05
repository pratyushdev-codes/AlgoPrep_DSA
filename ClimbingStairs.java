import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = climbStairs(n);
        System.out.println(result);
    }

    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climbStairsHelper(n, dp);
    }

    public static int climbStairsHelper(int n, int[] dp) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        int a = climbStairsHelper(n - 1, dp);
        int b = climbStairsHelper(n - 2, dp);

        dp[n] = a + b;
        return dp[n];
    }
}
