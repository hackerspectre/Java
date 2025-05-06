// This is a Boilerplate Code !!! ✅
/*
public class JavaBasics {

    public static void main(String args[]) {

    }
}
*/

// This is my first JAVA Code !!! ✅
/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hello Hacker!");
        System.out.println("1 2 3 4 5");
    }
}
*/

// Print Pattern !!! ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
}
*/

// Variables in JAVA !!! ✅
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        String name = "Mr. Hacker Bikram";
        System.out.println(name);

        a = 50;
        System.out.println(a);

        a = b;
        System.out.println(a);
    }
}
*/

// Data Types in JAVA !!! ✅
/* 
import java.sql.Types;

public class JavaBasics {

    public static void main(String[] args) {
        byte a = 8;
        System.out.println(a);

        int number = 25;
        System.out.println(number);

        char ch = 'b';
        System.out.println(ch);

        boolean var1 = true;
        boolean var2 = false;
        System.out.println(var1);
        System.out.println(var2);

        float PI = 3.14f;
        System.out.println(PI);

        double price = 10.5;
        System.out.println(price);

        // long
        long num = 1234567890123456789L;
        System.out.println(num);

        // double
        double d = 1234567890123456789.0;
        System.out.println(d);

        // short
        short s = 12345;
        System.out.println(s);
    }
}
*/

// Sum of a & b !!! ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        int sum = a + b;
        System.out.println(sum);
    }
}
*/

// Comments in JAVA !!! ✅ 

// Single Line Comment 

/* 
 Multi
 line 
 comments
*/

// Input in JAVA !!! ✅ 
/* 
import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String input = sc.next();
        // System.out.println(input);

        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        // float price = sc.nextFloat();
        // System.out.println(price);

        // boolean student = sc.nextBoolean();
        // System.out.println(student);

        // short num = sc.nextShort();
        // System.out.println(num);

        long largeNumber = sc.nextLong();
        System.out.println(largeNumber);
    }
}
*/

// Sum of a & b (Input from User) !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);
    }
}
*/

// Product of a & b !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;
        System.out.println(product);
    }
}
*/

// Area of a Circle !!! ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        float reduis = sc.nextFloat();

        float area = 3.14f * reduis * reduis;
        System.out.println(area);
    }
}
*/

// Type Conversion !!! ✅ 
// byte -> short -> int -> float -> long -> double 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        //This is allow
        int a = 25;
        long b = a;

        // This is not allow
        // long a = 25;
        // int b = a;

        System.out.println(b);


        Scanner sc = new Scanner(System.in);

        // This is allow
        float number = sc.nextInt();
        System.out.println(number);

        // This is not allow
        // int number = sc.nextFloat();
        // System.out.println(number);
    }
}
*/

// Type Casting !!! ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        // This is Not allow
        // float a = 25.12f;
        // int b = a;

        // This is allow
        float a = 25.12f;
        int b = (int)a;

        System.out.println(b);
    }
}
*/

/* 
public class JavaBasics {

    public static void main(String[] args) {
        char ch1 = 'a';
        char ch2 = 'b';

        int number1 = ch1;
        int number2 = ch2;

        System.out.println(number1);
        System.out.println(number2);
    }
}
*/

// Type Promotion in Expression !!! ✅ 
// 1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.
/* 
public class JavaBasics {

    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';

        // char c = a - b;  //This is wrong

        System.out.println((int)(a));
        System.out.println((int)(b));

        System.out.println(a);
        System.out.println(b - a);
    }
}
*/

/* 
public class JavaBasics {

    public static void main(String[] args) {
        short a = 5;
        byte b = 25;
        char c = 'c';

        // byte bt = a + b + c;  // Impossable 
        byte bt = (byte) (a + b + c);
        System.out.println(bt);

        int sum = a + b + c;
        System.out.println(sum);
    }
}
*/

// 2. If operand is long, float, or double the whole expression is promoted to long, float, or double respectively. 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int a = 10; 
        float b = 20.25f; 
        long c = 25;
        double d = 30;

        double ans = a + b + c + d;
        System.out.println(ans);
    }
}
*/

/* 
public class JavaBasics {

    public static void main(String[] args) {
        // Wrong 
        // byte b = 5;
        // byte a = b * 2;   //b = b * 2;
        // System.out.println(a);

        // Right
        byte b = 5;
        byte a = (byte) (b * 2);   //b = (byte) (b * 2);
        System.out.println(a);
    }
}
*/


// Practice Questions !!! ✅ 
// Variables & Data Types Questions ✅ 

// Question 1 : In a program, input 3 numbers A, B and C. You have to output the average of these 3 numbers 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float average = (A + B + C) / 3;
        System.out.println("Average is: " + average);
    }
}
*/


// Question 2 : In a program, input the side of a square. You have to output the area of the square.  [Hint: area of a square is (side x side)] 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float side = sc.nextFloat();

        float area = side * side;
        System.out.println("The area of the square is: " + area);
    }
}
*/


// Question 3 : Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. [Add on : You can also try adding 18% GST Tax to the items in the bill as an advanced problem]
/*
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Pen: ");
        float pen = sc.nextFloat();

        System.out.print("Eraser: ");
        float eraser = sc.nextFloat();

        sc.close();

        float total = pencil + pen + eraser;
        System.out.println("Bill is: " + total);

        // Try adding 18% tax 
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax: " + newTotal);
    }
}
*/


// Question 4 : What will be the type of result in the following JAVA Code? 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
}
*/


// Question 5 : (Advanced) Will the following statement give any error in JAVA? 
// int $ = 24;
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int $ = 24;
        System.out.println($);

        int _num = 5;
        System.out.println(_num);
    }
}
*/

/*
Answer: No, it will not give any error. The variable name $ is a valid identifier in Java. It is a valid character in the name of a variable. The variable name $ is not a keyword in Java. It is a valid character in the name of a variable.
*/
