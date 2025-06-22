// Backtracking ✅ 
/*
public class JavaBasics {
    public static void changeArr(int arr[], int i, int val) {
        //base case
        if(i == arr.length){
            //print
            printArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);

        //backtrack -2
        arr[i] = arr[i] - 2; 
    }

    //print
    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
*/

// Find Subsets ✅ 
// Find & Print all subsets of a given string. 
/*
public class JavaBasics {
    public static void findSubsets(String str, String curr, int i) {
        //base case
        if(i == str.length()) {
            //null value
            if(curr.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(curr);
            }
            return;
        }

        //recursion
        findSubsets(str, curr + str.charAt(i), i+1);
        findSubsets(str, curr, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}
*/

// Find Permutations ✅ 
// Find & Print all permutations of a given string.
/*
public class JavaBasics {
    public static void findPermutations(String str, String curr) {
        //base case
        if(str.length() == 0) {
            System.out.println(curr);
            return;
        }

        //recursion
        for(int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(newStr, curr + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutations(str, "");
    }
}
*/

// N-Queens ✅ 
// Place N queens on an NxN chessboard such that no 2 queens attack each other.
/*
import java.util.Scanner;

public class JavaBasics {
    private int N;
    private int[][] board;

    public JavaBasics(int N) {
        this.N = N;
        board = new int[N][N];
    }

    public void solve() {
        if (placeQueens(0)) {
            printSolution();
        } else {
            System.out.println("No solution exists for " + N + " queens.");
        }
    }

    private boolean placeQueens(int row) {
        if (row == N) {
            return true;
        }

        for (int col = 0; col < N; col++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                if (placeQueens(row + 1)) {
                    return true;
                }
                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    private boolean isSafe(int row, int col) {
        // Check this column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        JavaBasics queens = new JavaBasics(N);
        queens.solve();
    }
}
*/

// N-Queens - Count Ways ✅ 
// Count total number of ways in which we can solve N queens problem.
// Time Complexity: O(N!)
// Space Complexity: O(N)
// Using Java Programming
/*
public class JavaBasics {

    public static boolean isSafe(int[] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i] == col) {
                return false;
            }
        }

        // Check major diagonal (\ direction)
        for (int i = 0, j = 0; i < row && j < col; i++, j++) {
            if (board[i] == col - (row - i)) {
                return false;
            }
        }

        // Check minor diagonal (/ direction)
        for (int i = 0, j = 0; i < row && j < n; i++, j++) {
            if (board[i] == col + (row - i)) {
                return false;
            }
        }

        return true;
    }

    public static int solveNQueensUtil(int[] board, int row, int n) {
        if (row == n) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row] = col;
                count += solveNQueensUtil(board, row + 1, n);
                board[row] = -1; // Reset for backtracking
            }
        }

        return count;
    }

    public static int totalNQueens(int n) {
        int[] board = new int[n]; // Board representation
        return solveNQueensUtil(board, 0, n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Total number of ways to solve " + n + "-Queens problem: " + totalNQueens(n));
    }
}
*/

// Grid Ways ✅ 
// Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM Grid.
// You can move either right or down at any point in time.
/*
public class JavaBasics {
    public static int countWays(int n, int m){
        if(n == 1 || m == 1){
            return 1;
        }
        return countWays(n-1, m) + countWays(n, m-1);
    }

    public static void main(String[] args) {
        int N = 3, M = 3;
        System.out.println("Number of ways to reach from (0,0) to (" + (N - 1) + ", " + (M - 1) + ") in a " + N + "x" + M + " Grid: " + countWays(N,M));
    }
}
*/

// Sudoku ✅ 
// Write a function to complete a Sudoku.
/*
public class JavaBasics {
    // Check if placing num at board[row][col] is valid
    static boolean isValid(int[][] board, int row, int col, int num) {
        // Check the row
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num) {
                return false;
            }
        }

        // Check the column
        for (int x = 0; x < 9; x++) {
            if (board[x][col] == num) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    // Solve the Sudoku board using backtracking
    static boolean solveSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Find an empty cell
                if (board[i][j] == 0) {
                    // Try all numbers from 1 to 9
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, i, j, num)) {
                            board[i][j] = num;

                            // Recursively try to solve the rest of the board
                            if (solveSudoku(board)) {
                                return true;
                            }

                            // If we can't solve, reset and backtrack
                            board[i][j] = 0;
                        }
                    }

                    // If no number from 1 to 9 works, return false
                    return false;
                }
            }
        }

        // If all cells are filled correctly, return true
        return true;
    }

    // Print the Sudoku board
    static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}
*/

