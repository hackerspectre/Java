// Recursion Part II ✅ 
// Q11. Tiling Problem.
// Given a "2 x n" board and tiles of size "2 x 1", count the number of way to tile the given board using the 2 x 1 tiles.
// A tile can either be placed horizontally or vertically.
/*
public class JavaBasics {
    public static int tilingProblem(int n) {
        //base case
        if(n == 0 || n == 1) {
            return 1;
        }

        // if (n == 1) return 1;
        // if (n == 2) return 2;

        //horizontally
        int h = tilingProblem(n - 1);
        //vertically
        int v = tilingProblem(n - 2);

        //total
        int totalWay = h + v;

        return totalWay;

        // return tilingProblem(n-1) + tilingProblem(n-2);
    }

    public static void main(String[] args) {
        int n = 4; // size of the board
        System.out.println(tilingProblem(n));
    }
}
*/

// Q12. Remove Duplicates in a String using Recursion.
// "appnnacollege"
/*
public class JavaBasics {
    public static String removeDuplicates(String str, int index, String newStr) {
        //base case
        if (index == str.length()) {
            return newStr;
        }

        char ch = str.charAt(index);
        if (newStr.indexOf(ch) == -1) {
            newStr += ch;
        }

        return removeDuplicates(str, index + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "college";
        System.out.println(removeDuplicates(str, 0, ""));
    }
}
*/

// Q13. Friends Pairing Problem 
// Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. using recursion.
/*
public class JavaBasics {
    public static int friendsPairing(int n) {
        //base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // single
        int single = friendsPairing(n - 1);

        //multiple PairUP
        int pairUp = (n - 1) * friendsPairing(n - 2);

        //totalPaired
        int totalPaired = single + pairUp;
        return totalPaired;

        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }

    public static void main(String[] args) {
        int n = 3; // number of friends
        System.out.println(friendsPairing(n));
    }
}
*/

// Q14. Binary Strings Problem.
// Print all binary strings of size N without consecutive ones.
/*
public class JavaBasics {
    public static void binaryStrings(int n, int lastPlace, String str) {
        //base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        //recursive case
        if (lastPlace == 0) {
            binaryStrings(n - 1, 0, str + "0");
            binaryStrings(n - 1, 1, str + "1");
        } else {
            binaryStrings(n - 1, 0, str + "0");
        }
    }

    public static void main(String[] args) {
        int n = 5; // size of binary string
        binaryStrings(n, 0, "");
    }
}
*/
