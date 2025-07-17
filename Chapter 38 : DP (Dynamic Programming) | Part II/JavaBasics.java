// Greedy Algorithm ✅ 
// Fractional Knapsack Problem 

// Given the weights and values of N items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. 
// Value = [60, 100, 120] | Weight = [10, 20, 30] | Capacity = 50 
// Output = 240

/*
import java.util.*;

public class JavaBasics {
    static class Item {
        int value;
        int weight;
        int ratio;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = value / weight;
        }
    }

    public static int knapsack(int[] wt, int[] val, int W) {
        Item[] items = new Item[wt.length];
        for (int i = 0; i < wt.length; i++) {
            items[i] = new Item(val[i], wt[i]);
        }

        Arrays.sort(items, (a, b) -> b.ratio - a.ratio);

        int totalValue = 0;
        for (Item item : items) {
            if (W >= item.weight) {
                W -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.value * W / item.weight;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int[] wt = {10, 20, 30};
        int[] val = {60, 100, 120};
        int W = 50;

        System.out.println(knapsack(wt, val, W));
    }
}
*/


// DP (Dynamic Programming) | Part II ✅

// 0-1 Knapsack Problem ✅ 
// val[] = 15, 14, 10, 45, 30
// wt[] = 2, 5, 1, 3, 4
// W (total allowed weight) = 7

/*
import java.util.*;

public class JavaBasics {
    // Recursion Solution ✅
    // Time Complexity: O(2^n)
    public static int knapsack(int[] val, int[] wt, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) {
            return Math.max(val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1), knapsack(val, wt, W, n - 1));
        } else {
            return knapsack(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(knapsack(val, wt, W, val.length));
    }
}
*/


// 0 - 1 Knapsack Problem using (Memoization) ✅ 
// val[] = 15, 14, 10, 45, 30
// wt[] = 2, 5, 1, 3, 4
// W (total allowed weight) = 7

/*
import java.util.*;

public class JavaBasics {
    // Memoization Solution ✅ 
    // Time Complexity: O(n * W)
    public static int knapsack(int[] val, int[] wt, int W, int n, int[][] dp) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) {
            return dp[n][W] = Math.max(val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, dp), knapsack(val, wt, W, n - 1, dp));
        } else {
            return dp[n][W] = knapsack(val, wt, W, n - 1, dp);
        }
    }

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;

        int[][] dp = new int[val.length + 1][W + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(knapsack(val, wt, W, val.length, dp));
    }
}
*/


// 0 - 1 Knapsack Problem using (Tabulation) ✅ 
// val[] = 15, 14, 10, 45, 30
// wt[] = 2, 5, 1, 3, 4
// W (total allowed weight) = 7

/*
import java.util.*;

public class JavaBasics {
    // Tabulation Solution ✅ 
    // Time Complexity: O(n * W)
    public static int knapsack(int[] val, int[] wt, int W) {
        int[][] dp = new int[val.length + 1][W + 1];
        for (int i = 0; i < val.length + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[val.length][W];
    }

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println(knapsack(val, wt, W));
    }
}
*/


// Target Sum Subset Problem using tabulation ✅ 
// val[] = 4, 2, 7, 1, 3
// target = 10

/*
import java.util.*;

public class JavaBasics {
    // Tabulation Solution ✅ 
    // Time Complexity: O(n * target)
    public static int targetSumSubset(int[] val, int target) {
        int n = val.length;
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < target + 1; j++) {
                if (i == 0) {
                    dp[i][j] = 0;
                } else if (j == 0) {
                    dp[i][j] = 1;
                } else if (val[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j - val[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][target];
    }

    public static void main(String[] args) {
        int[] val = {4, 2, 7, 1, 3};
        int target = 10;

        System.out.println(targetSumSubset(val, target));
    }
}
*/


// Unbounded Knapsack Problem using Tabulation ✅ 
// val[] = 15, 14, 10, 45, 30
// wt[] = 2, 5, 1, 3, 4
// W (total allowed weight) = 7

/*
import java.util.*;

public class JavaBasics {
    // Tabulation Solution ✅ 
    // Time Complexity: O(n * W)
    public static int unboundedKnapsack(int[] val, int[] wt, int W) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int W = 7;
        System.out.println(unboundedKnapsack(val, wt, W));
    }
}
*/
