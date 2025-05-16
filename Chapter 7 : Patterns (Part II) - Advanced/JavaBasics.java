// Patterns ✅ 
// HOLLOW RECTANGLE pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void hollow_rectangle(int rows, int columns) {
        for(int i=1; i<=rows; i++) {
            for(int j=1; j<=columns; j++) {
                if (i==1 || i==rows || j==1 || j==columns) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Columns: ");
        int num2 = sc.nextInt();

        hollow_rectangle(num1, num2);
    }
}
*/

// INVERTED & ROTATED HALF-PYRAMID pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Inner loop for printing asterisks
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
*/

// INVERTED HALF-PYRAMID with Numbers pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num-i+1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
*/

// FLOYD'S Triangle pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void floyds_triangle(int n) {
        int counter = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(counter + " ");
                counter++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        floyds_triangle(num);
    }
}
*/

// 0-1 Triangle pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void zero_one_triangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if ((i+j) % 2 == 0) {
                    System.out.print("0");
                }
                else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter number: ");
        int num = sc.nextInt();

        zero_one_triangle(num);
    }
}
*/

// BUTTERFLY pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void butterfly(int n) {
        //1st half
        for(int i=1; i<=n; i++) {
            //stars - i 
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--) {
            //stars - i 
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }

            //stars - i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        butterfly(num);
    }
}
*/

// SOLID RHOMBUS pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void solid_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        solid_rhombus(num);
    }
}
*/

// HOLLOW RHOMBUS pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void hollow_rhombus(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }

            // hollow rectangle - stars
            for(int j=1; j<=n; j++) {
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        hollow_rhombus(num);
    }
}
*/

// DIAMOND pattern ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void diamond(int n) {
        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        diamond(num);
    }
}
*/

