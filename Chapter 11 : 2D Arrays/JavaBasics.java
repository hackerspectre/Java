// 2D Arrays ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at index: " + "["+i+" , "+j+"]");
                    return true;
                }
            }
        }
        System.out.println("Element not found.");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3]; // Declare and initialize a 2D array with 3 rows and  3 columns.
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element: ");

        for(int i=0; i<n; i++) {
            for(int j=0; j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
    }
}
*/

// Spiral Matrix ✅ 
/* 
public class JavaBasics {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Print top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }

            // Print rightmost column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Print bottom row
            for (int i = endCol - 1; i >= startCol; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][i] + " ");
            }

            // Print leftmost column
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        printSpiral(matrix);
    }
}
*/

// Diagonal Sum ✅
/* 
public class JavaBasics {
    public static int diagonalSum(int matrix[][]) {
        
        // int sum = 0;
        // int row = 0;
        // int col = 0;
        // while (row < matrix.length && col < matrix[0].length) {
        //     sum += matrix[row][col];
        //     row++;
        //     col++;
        // }
        // return sum;
        
        
        // int sum = 0;
        // for (int i=0;i<matrix.length;i++) {
        //     for(int j=0; j<matrix[0].length;j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } 
        //         else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        // return sum;
        

        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            sum+=matrix[i][i]; // add the number on the main diagonal

            // if (i != matrix.length-1-i) {
            //     sum+=matrix[i][matrix.length-1-i]; // add the number on the other diagonal
            // }

            sum+=matrix[i][matrix[0].length-i-1]; // add the number on the anti-diagonal
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        
        System.out.println(diagonalSum(matrix));
    }
}
*/

// Search in Sorted Matrix ✅ 
// Staircase Search ✅
/* 
public class JavaBasics {
    public static boolean staircaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key){
                System.out.println("found key at (" + row + ","  + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println(key + " is not present in the matrix."); 
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {  {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50} };
        int key = 33;

        staircaseSearch(matrix, key);
    }
}
*/

