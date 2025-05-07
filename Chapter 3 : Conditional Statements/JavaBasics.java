// if-else Statements !!! ✅
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int age = 12;

        if (age >= 18) {
            System.out.println("You can Vote & Drive");
        }
        else {
            System.out.println("You can't Vote & Drive");
        }
    }
}
*/

/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You can Vote & Drive");
        }
        else {
            System.out.println("You can't Vote & Drive");
        }
    }
}
*/

// Print the largest of 2 !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int A = 1, B = 3;

        System.out.println("Enter your 1st number: ");
        int A = sc.nextInt();

        System.out.println("Enter your 2nd number: ");
        int B = sc.nextInt();

        if (A >= B) {
            System.out.println("The largest number is: " + A);
        }
        else {
            System.out.println("The largest number is: " + B);
        }
    }
}
*/

// Print if a number is Odd or Even !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int number = 4;

        System.out.println("Enetr a Number: ");
        int number = sc.nextInt();

        if (number %2 == 0) {
            System.out.println("This number is: Even");
        }
        else {
            System.out.println("This number is: Odd");
        }
    }
}
*/

// else if Statements !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You can Vote & Drive");
        }
        else if (age >= 13 && age <= 17) {
            System.out.println("You are a Teenager");
        }
        else {
            System.out.println("You can't Vote & Drive");
        }
    }
}
*/

// Income tax Calculator !!! ✅ 
/*
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income: ");
        float income = sc.nextFloat();

        float tax = 0.0f;

        if (income <= 500000) {
            tax = income * 0.0f;
        }
        else if (income >= 500000 && income <= 1000000) {
            tax = income * 0.2f;
        }
        else if (income >= 1000000) {
            tax = income * 0.3f;
        }
        else {
            System.out.println("Wrong Value");
        }

        System.out.println("Your tax is: " + tax);

    }
}
*/

// Print the largest of 3 !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int A = 16, B = 3, C = 6;

        System.out.println("Enter 1st number: ");
        int A = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int B = sc.nextInt();

        System.out.println("Enter 3rd number: ");
        int C = sc.nextInt();

        if ((A >= B) && (A >= C)) {
            System.out.println("The largest number is: " + A);
        }
        else if (B >= C) {
            System.out.println("The largest number is: " + B);
        }
        else {
            System.out.println("The largest number is: " + C);
        }
    }
}
*/

// ternary Operator !!! ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int number = 1;

        String type = (number %2 == 0) ? "Even" : "Odd";
        System.out.println(type);
    }
}
*/

// Check if a student will Pass or Fail !!! ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int marks = 34;

        String result = (marks >= 33) ? "PASS" : "FAIL";
        System.out.println(result);
    }
}
*/

// Switch Statement !!! ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int number = 2;

        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            
            case 2:
                System.out.println("burger");
                break;

            case 3:
                System.out.println("mango shake");
                break;
        
            default:
                System.out.println("we wake up");
                break;
        }
    }
}
*/

// Calculator !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.println("Select one operator: + , - , * , / , %");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("The Vale is a + b = " + (a+b));
                break;
            
            case '-':
                System.out.println("The Vale is a - b = " + (a-b));
                break;

            case '*':
                System.out.println("The Vale is a * b = " + (a*b));
                break;

            case '/':
                System.out.println("The Vale is a / b = " + (a/b));
                break;

            case '%':
                System.out.println("The Vale is a % b = " + (a%b));
                break;

            default:
                System.out.println("Wrong Operator");
                break;
        }
    }
}
*/

// CONDITIONAL STATEMENTS QUESTIONS !!! ✅ 

// Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative. 
/*
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int whether = sc.nextInt();

        if (whether > 0) {
            System.out.println("Whether is greater than 0 " + "Whether is : " + whether);
        }
        else {
            System.out.println("Whether is less than 0 " + "Whether is : " + whether);
        }

        sc.close();
    }
}
*/

// Question 2 : Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your temperature: ");
        double temperature = sc.nextDouble();

        if (temperature > 100.00) {
            System.out.println("You have a fever");
        }
        else {
            System.out.println("You don't have a fever");
        }
    }
}
*/

// Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter week number(1-7): ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;          

            default:
                System.out.println("Invalid input! Please enter week number between (1-7)");
                break;
        }
    }
}
*/

// Question 4 : What will be the value of x & y in the following program: 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int a = 63, b = 36;

        boolean x = (a < b ) ? true : false;
        int y = (a > b ) ? a : b;

        System.out.println(x);
        System.out.println(y);
    }
}
*/

// Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not.
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } 
        else {
            System.out.println(year + " is not a leap year");
        }
    }
}
*/

/*
import java.util.Scanner;
public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a leap year");
        } 
        else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
*/

