//Greedy ✅ 
import java.lang.reflect.Array;
import java.util.*;

public class JavaBasics {
    // activitySelection ✅
    /*
    static void activitySelection(int start[], int end[], int n) {
        int i = 0;
        int maxActivity = 1;
        System.out.print("Following activities are selected : ");
        System.out.print(i + " ");

        // next
        for (int j = 1; j < n; j++) {
            if (start[j] >= end[i]) {
                System.out.print(j + " ");
                i = j;
                maxActivity++;
            }
        }
        System.out.println("\nMaximum Activity: " + maxActivity);
    }
    */

    public static void main(String[] args) {
        /*
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int n = start.length;

        activitySelection(start, end, n);
        */

        // Q. You are given n activities with their start and end times. Select the
        // maximum number of activities that can be performed by a single person,
        // assuming that a person can only work on a single activity at a time.
        // Activities are sorted according to end time.
        /*
        // 2D arrays sort
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        

        // sorting
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < activities.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        // print
        System.out.println("Max Activities: " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
        */

        // Q. Given the weights and values of N items, put these items in a knapsack of
        // capacity W to get the maximum total value in the knapsack.
        /*
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;

        double ratio[][] = new double[val.length][2];

        // next
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = (double) val[i] / wt[i];
            ratio[i][1] = i;
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[0]));

        int capacity = W;
        int finalVal = 0;

        // next
        for (int i = ratio.length - 1; i >= 0; i--) {
            if (wt[(int) ratio[i][1]] <= capacity) {
                finalVal += val[(int) ratio[i][1]];
                capacity -= wt[(int) ratio[i][1]];
            } else {
                finalVal += (int) (ratio[i][0] * capacity);
                break;
            }
        }

        System.out.println("Maximum value in knapsack = " + finalVal);
        */

        // Min Absolute Difference Pairs ✅
        // Given two arrays A and B of equal length n. Pair each element of array A to
        // an element in array B, such that sum S of absolute differences of all the
        // pairs is minimum.
        /*
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum sum of absolute differences = " + sum);
        */

        // Max Length Chain of Pairs ✅
        // You are given n pairs of numbers. In every pair, the first number is always
        // smaller than the second number. A pair (c,d) can come after pair (a,b) if
        // b<c.
        // Find the longest chain which can be formed from a given set of pairs.
        /*
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1]));

        int maxLen = 1, currLen = 1, prev = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > prev) {
                currLen++;
                prev = pairs[i][1];
            }
            maxLen = Math.max(maxLen, currLen);
        }

        System.out.println("Length of longest chain = " + maxLen);
        */

        // Indian Coins ✅
        // We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100,
        // 500, 2000] Find min no. of coins/notes to make change for a value V.
        /*
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        Arrays.sort(coins);

        int countOfCoins = 0;
        int amount = 1059;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                countOfCoins++;
                ans.add(coins[i]);
            }
        }

        System.out.println("Minimum number of coins/notes = " + countOfCoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        */
    }
}
