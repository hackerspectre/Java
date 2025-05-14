// Functions / Methods ✅ 
// Syntax 
/* 
public class JavaBasics {
    public static void printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        // return;
    }
    public static void main(String[] args) {
        printHelloWorld();  // Function Call
    }
}
*/

/* 
public class JavaBasics {
    public static int printHelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        return 3;
    }
    public static void main(String[] args) {
        printHelloWorld();
    }
}
*/

// Syntax with Parameters ✅
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void claculateSum(int num1, int num2) {
        int totalSum = num1 + num2;
        System.out.println("Sum is: " + totalSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.print("Enter number: ");
        int b = sc.nextInt();

        claculateSum(a, b);
    }
}
*/

/* 
import java.util.Scanner;

public class JavaBasics {
    public static int claculateSum(int num1, int num2) {    //parameters or formal parameters
        int totalSum = num1 + num2;
        return totalSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.print("Enter number: ");
        int b = sc.nextInt();

        int sum = claculateSum(a, b);   //arguments or actual parameters
        System.out.println("Sum is: " + sum);
    }
}
*/

// Call by Value - Copy ✅				Call by Reference - Original ✅ 
// Java always calls by value 
/* 
public class JavaBasics {
    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        // swap - values exchange
        int a = 4;
        int b = 6;

        swap(a, b);
    }
}
*/

// Find Product of a & b ✅      ||        a = 3,  b = 5
/* 
import java.util.Scanner;

public class JavaBasics {
    public static int multiply(int num1, int num2) {
        int sum = num1 * num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = sc.nextInt();

        System.out.print("Enter number: ");
        int b = sc.nextInt();

        int result = multiply(a, b);
        System.out.println("Product of a & b is: " + result);
    }
}
*/

// Factorial of a number, n ✅        ||          n = 4
// n! 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static int factorial(int n) {
        int f = 1;

        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        
        return f;   //factorial of n
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = factorial(num);
        System.out.println("Factorial is: " + sum);
    }
}
*/

// Binomial Coefficient ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static int factorial(int n) {
        int f = 1;

        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        
        return f;   //factorial of n
    }

    public static int binoCoef(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int facr_nmr = factorial(n-r); 

        int binoCoef = fact_n / (fact_r * facr_nmr);
        return binoCoef;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int num1 = sc.nextInt();

        System.out.print("Enter r: ");
        int num2 = sc.nextInt();

        int sum = binoCoef(num1, num2);
        System.out.println("Binomial Coefficient is: " + sum);
    }
}
*/

// Function Overloading ✅ 
// using Parameters
/* 
public class JavaBasics {
    // function of calculate sum of 2 numbers
    public static int sum(int a, int b) {
        return a+b;
    }

    // function of calculate sum of 3 numbers
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 Numbers: " + sum(3, 5));
        System.out.println("Sum of 3 Numbers: " + sum(5, 2, 1));
    }
}
*/

// Function Overloading ✅ 
// using Data Types
/* 
public class JavaBasics {
    // function to calculate int sum
    public static int sum(int a, int b) {
        return a+b;
    }

    // function to calculate float sum
    public static float sum(float a, float b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println("Number of 2 int sum: " + sum(3, 5));
        System.out.println("Number of 2 float sum: " + sum(3.2f, 4.8f));
    }
}
*/

// Check if a number is Prime or Not ✅ 
/* 
public class JavaBasics {
    public static boolean isPrime(int n) {
        boolean isPrime = true;

        if (n == 2) {
            return true;
        }

        for(int i=2; i<=n-1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(3));
    }
}
*/

/* 
public class JavaBasics {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
}
*/

// Print all Primes in a Range ✅ 
/* 
public class JavaBasics {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if (isPrime(i)) {   //true
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primesInRange(20);  // 2 to 20
        primesInRange(100);  // 2 to 100
    }
}
*/

// Convert from Binary to Decimal ✅ 
/* 
public class JavaBasics {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }

        System.out.println("Decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        binToDec(101);
    }
}
*/

// Convert from Decimal to Binary ✅ 
/* 
public class JavaBasics {
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        System.out.println("Binary from of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        decToBin(7);
    }
}
*/

// FUNCTIONS QUESTIONS ✅ 
// Question 1 : Write a Java method to compute the average of three numbers.. 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static double averageNum(double a, double b, double c) {
        double totalSum = (a + b + c) / 3;
        return totalSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter 3rd number: ");
        double num3 = sc.nextDouble();

        double sum = averageNum(num1, num2, num3);
        System.out.println("The average value is: " + sum);
    }
}
*/

// Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method. ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}
*/

// Question 3 : Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not) ✅
// A number is called a palindrome if the number is equal to the reverse of a number eg., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
/* 
import java.util.Scanner;

public class JavaBasics {
    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome > 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }
        
        // if (number == reverse) {
        //     return true;
        // }
        // else {
        //     return false;
        // }

        return number == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("Number : " + num + " is a palindrome");
        }
        else {
            System.out.println("Number : " + num + " is not a palindrome");
        }
    }
}
*/

// Question 5 : Write a Java method to compute the sum of the digits in an integer. ✅
/* 
Hint : Approach this question in the following way :
    a. Take a variable sum = 0
    b. Find the last digit of the number
    c. Add it to the sum
    d. Repeat a & b until the number becomes 0
*/

/* 
import java.util.Scanner;

public class JavaBasics {
    public static int sumDigit(int n) {
        int sumOfDigits = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sumOfDigits = sumOfDigits + lastDigit; 
            n = n / 10;
        }

        return sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int num = sc.nextInt();

        System.out.println("The sum is: " + sumDigit(num));
    }
}
*/

