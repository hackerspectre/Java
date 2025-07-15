// DP (Dynamic Programming) ✅ 
// DP is optimized version of recursion

// Time Complexity = O(n)
// Space Complexity = O(n)

import java.util.*;

public class JavaBasics {
    // Fibonacci Series | Memoization Technique (Top Down) ✅ 
    public static int fibonacci(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);
        return dp[n];
    }

    // Fibonacci Series | Tabulation Technique (Bottom Up) ✅ 
    public static int fibonacci(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // Climbing Stairs ✅ 
    // 1. Recursive Solution 
    /*
    public static int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    */

    // 2. Memoization Technique
    public static int climbStairs(int n, int[] dp) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
        return dp[n];
    }

    // 3. Tabulation Technique
    public static int climbStairs(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }


    public static void main(String[] args) {
        // Fibonacci Series | Memoization Technique (Top Down) ✅ 
        /*
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(fibonacci(n, dp));
        */

        // Fibonacci Series | Tabulation Technique (Bottom Up) ✅ 
        /*
        int n = 5;
        System.out.println(fibonacci(n));
        */


        // Climbing Stairs ✅ 
        // Qs. Count ways to reach the nth stair. The person can climb either 1 step or 2 steps at a time.

        // 1. Recursive Solution
        /*
        int n = 5;
        System.out.println(climbStairs(n));
        */

        // 2. Memoization Technique
        /*
        int n = 5;
        int[] dp = new int[n + 1];
        System.out.println(climbStairs(n, dp));
        */

        // 3. Tabulation Technique
        int n = 5;
        System.out.println(climbStairs(n));
    }
}
