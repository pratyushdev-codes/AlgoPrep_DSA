import java.util.*;

public class PerfectSqaures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int result = perfectSquareHelper(dp, n);
        System.out.println(result);
    }

    public static int perfectSquare(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return perfectSquareHelper(dp, n);
    }

    public static int perfectSquareHelper(int[] dp, int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        if(dp[n] != -1) {
            return dp[n];
        }

        int smallest = Integer.MAX_VALUE;
        for(int i = 1; i * i <= n; i++) {
            int temp = perfectSquareHelper(dp, n - i * i);
            smallest = Math.min(temp, smallest);
        }

        dp[n] = smallest + 1;
        return dp[n];
    }
}
