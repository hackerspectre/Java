/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }
}
*/

// Loops ✅
// while Loop ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 100) {
            System.out.println(counter + ". Hello World!");
            counter++;
        }

        System.out.println("Printer Hello World 100x");
    }
}
*/

// Print number from 1 to 10 ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 10) {
            System.out.print(counter + " ");
            // System.out.println(counter);
            counter++;
        }
    }
}
*/

// Print number from 1 to n ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int range = sc.nextInt();

        int counter = 1;

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}
*/

// Print sum of first n natural numbers ✅
 /* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int counter = 1;
        int sum = 0;

        while (counter <= number) {
            // sum = sum + counter;
            sum += counter;
            counter++;
        }

        System.out.println("Total sum is: " + sum);
    }
}
*/

// Create a number table ✅
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Table Number: ");
        int table = sc.nextInt();

        int counter = 1;

        while (counter <= 10) {
            System.out.println(table + " x " + counter + " = " + (table * counter));
            counter++;
        }
    }
}
*/

// for Loop ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        // int i = 1;
        for(int i=1; i<=10; i++) {
            System.out.println("Hello World!");
        }
    }
}
*/

// Print SQUARE pattern ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        // int i = 1;
        for(int i = 1; i<=4; i++) {
            System.out.println("* * * *");
        }
    }
}
*/

// Print Reverse of a number ✅ 
// n = 791  ->  197
// last dig  num%10
// remove last dig  num/10
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit);
            number = number / 10;   // number /= 10
        }
    }
}
*/

// Reverse the given number ✅ 
// rev = (rev*10) + lastDigit 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int num = 791;
        int reverse = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverse = (reverse*10) + lastDigit;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
*/

// do-while Loop ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int counter = 1;
        do {
            System.out.println("Hello World!");
            counter++;
        } while(counter <= 10);
    }
}
*/

// Break Statement ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        // int counter = 1;
        // do {
        //     if (counter == 3) {
        //         break;
        //     }
        //     System.out.println(counter);
        //     counter++;
        // } while(counter <= 5);

        for(int i=1; i<=5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
*/

// Keep entering numbers till user enters a multiple of 10 ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                break;
            }
            System.out.println(num);
        } while(true);
    }
}
*/

// Continue Statement ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        } 
    }
}
*/

// Display all numbers entered by user except multiples of 10 ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num % 10 == 0) {
                continue;
            }

            System.out.println(num);
        } while(true);
    }
}
*/

// Check if a number is prime or not !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        if (num == 2) {
            System.out.println("Number is prime");
        } else {
            boolean isPrime = true;

            for(int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {    // num is divisible by i
                    isPrime = false;
                    break;  // No need to check further
                }
            }

            if (isPrime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }    
    }
}
*/


// LOOPS QUESTIONS !!! ✅ 

// Question 1 :How many times 'Hello' is printed? ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        for(int i=0; i<=5; i++) {
            System.out.println("Hello JAVA!");
            i+=2;
        }
    }
}
*/


// Question2: Write a program that reads a set of integers, and then prints the sum of the even and odd integers. ✅
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter Number: ");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            }
            else {
                oddSum += number;
            }

            System.out.print("Do you want to continue?Press 1 for yes or 0 for no: ");

            choice = sc.nextInt();

        } while(choice == 1);

        System.out.println("Sum of even numbers: "+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
    }
}
*/


// Question 3 : Write a program to find the factorial of any number entered by the user. ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int fact = 1;

        System.out.print("Enter a positive integer: ");
        num = sc.nextInt();

        for(int i=1; i<=num; i++) {
            fact *= i;
        }
        
        System.out.println("Factorial: " + fact);
    } 
}
*/


// Question 4 : Write a program to print the multiplication table of a number N, entered by the user. 
/*
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter table number: ");
        int number = sc.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(number + "x" + i + "=" + (number*i));
        }
    }
}
*/


// Question 5 : What is wrong in the following program? ✅ 
/*
public class JavaBasics {

    public static void main(String[] args) {
        for(int i=0; i<=5; i++) {
            System.out.println("i = " + i);
        }

        // System.out.println("i after the loop = " + i);
        // Because i is local variable of for loop it is not accessible outside the loop. 
    }
}
*/

