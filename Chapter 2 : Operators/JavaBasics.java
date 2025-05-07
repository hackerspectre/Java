// 1. Arithmetic Operators !!! ✅
// Binary Operators !!! ✔
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int A = 10;
        int B = 5;

        System.out.println("Addition = " + (A+B));
        System.out.println("Subtraction = " + (A-B));
        System.out.println("Multiplition = " + (A*B));
        System.out.println("Divition = " + (A/B));
        System.out.println("Modulo(Remainder) = " + (A%B));
    }
}
*/

// Unary Operators ✔ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        // Pre Increment
        // int a = 10;
        // int b = ++a;

        // Post Increment
        int a = 10;
        int b = a++;

        System.out.println(a);
        System.out.println(b);
    }
}
*/

/* 
public class JavaBasics {

    public static void main(String[] args) {
        // Pre Decrement
        // int a = 10;
        // int b = --a;

        // Post Decrement
        int a = 10;
        int b = a--;

        System.out.println(a);
        System.out.println(b);
    }
}
*/


// 2. Relational Operators ✅
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int A = 10;
        int B = 5;

        System.out.println("Equal = " + (A==B));
        System.out.println("NotEqualTo = " + (A!=B));
        System.out.println("GreaterThan = " + (A>B));
        System.out.println("LessThan = " + (A<B));
        System.out.println("GreaterThanEqualTo = " + (A>=B));
        System.out.println("LessThanEqualTo = " + (A<=B));
    }
}
*/


// 3. Logical Operators !!! ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int A = 10;
        int B = 5;

        // Logical AND
        System.out.println((A>B) && (A>B));
        System.out.println((A>B) && (A<B));
        System.out.println((A<B) && (A>B));
        System.out.println((A<B) && (A<B));

        // Logical OR
        System.out.println((A>B) || (A>B));
        System.out.println((A>B) || (A<B));
        System.out.println((A<B) || (A>B));
        System.out.println((A<B) || (A<B));

        // Logical NOT
        System.out.println(!(A>B));
        System.out.println(!(A<B));
    }
}
*/


// 5. Assignment Operators !!! ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int A = 10;
        // A = A + 10;
        // A += 10;

        // A = A - 5;
        // A -= 5;

        // A = A * 10;
        // A *= 10;

        // A = A / 5;
        A /= 5;

        System.out.println(A);
    }
}
*/


// Operators Questions !!! ✅ 
// Quetion 1 : 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.println(exp1);
        System.out.println(exp2);
    }
}
*/


// Ouestion 2 : 
/*
public class JavaBasics {

    public static void main(String[] args) {
        int x = 200, y = 50, z = 100; 

        if (x > y && y > z) {
            System.out.println("Hello");
        }

        if (x > y && y < z) {
            System.out.println("Java");
        }

        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }
    }
}
*/


// Question 3 : 
/*
public class JavaBasics {

    public static void main(String[] args) {
        int x, y, z;

        x = y = z = 2;

        x += y;
        y -= z;
        z /= (x + y);

        System.out.println(x + " " + y + " " + z);
    }
}
*/


// Question 4 :
/*
public class JavaBasics {

    public static void main(String[] args) {
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;

        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);

        System.out.println(exp);
    }
}
*/

/*
    // explain - 
    4 / 3 * (9 + 34) + 9 * (2 + 4 * 6) + (3 + 12 * (2 + 2)) / ( 2 + 4 * 12)
    4 / 3 * (9 + 34) + 9 * (2 + 4 * 6) + (3 + 12 * 4) / ( 2 + 4 * 12)
    4 / 3 * (9 + 34) + 9 * (2 + 24) +  (3 + 48) / ( 2 + 48)
    4 / 3 * 43 + 9 * 26 + 51 / 50
    4 / 3 * 43 + 234 + 51 / 50
    // Now, here’s where the integer division comes into play. The division 4 / 3 becomes 1 (due to integer division), and 51 / 50 becomes 1 for the same reason.
    1 * 43 + 234 + 1
    43 + 234 + 1
    278
*/


// Question 5 : 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);
    }
}
*/

