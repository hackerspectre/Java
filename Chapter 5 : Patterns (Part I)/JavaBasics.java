import java.util.*;

// Print STAR pattern ✅ 
/*
public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/

// Print INVERTED-STAR pattern ✅ 
/*
public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        sc.close();

        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
*/

/* 
public class JavaBasics {

    public static void main(String[] args) {
        int n=15;
        
        for(int line=1; line<=n; line++) {
            for(int start=n; start>=line; start--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/* 
public class JavaBasics {

    public static void main(String[] args) {
        int n = 10;

        for(int line=1; line<=n; line++) {
            for(int start=1; start<=n-line+1; start++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


// Print HALF-PYRAMID pattern ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for(int line=1; line<=n; line++) {
            for(int number=1; number<=line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
*/


// Print CHARACTER pattern ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        
        char ch = 'A';

        // outer loop
        for(int line=1; line<=n; line++) {
            // inner loop
            for(int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
*/


// How to solve Pattern Probelms ✅ 
// 1. Count the number of stars and spaces in first line / every line. 
// 2. see how stars and spaces changes in every line. 
// 3. Code it. 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int st = 1; 
        int sp = n-1;

        int number_of_line = 1;

        while(number_of_line<=n) {
            // print start
            for(int j=1; j<=st; j++) {
                System.out.print("* ");
            }

            // print spaces
            for(int j=1; j<=sp; j++) {
                System.out.print("  ");
            }

            // prepare for next line
            System.out.println();
             st++;
             sp--;
             number_of_line++;
        }
    }
}
*/


/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numner: ");
        int n = sc.nextInt();

        int st = 1;
        int sp = n-1;

        int number_of_line = 1;
        while (number_of_line<=n) {
            // print spaces
            for(int i=1; i<=sp; i++) {
                System.out.print("  ");
            }

            // print stars
            for(int j=1; j<=st; j++) {
                System.out.print("* ");
            }

            // prepare for next line
            System.out.println();
            st++;
            sp--;
            number_of_line++;
        }
    }
}
*/
