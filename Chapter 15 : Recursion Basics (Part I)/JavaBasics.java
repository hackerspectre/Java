// Recursion ✅ 
// Q1. Print numbers from n to 1 in decreasing order. 
/*
public class JavaBasics {
    public static void printDec(int n) {
        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int num = 10;
        printDec(num);
    }
}
*/

// Q2. Print numbers from 1 to n in Increasing order. 
/*
public class JavaBasics {
    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int num = 10;
        printInc(num);
    }
}
*/

// Q3. Print factorial of a number n.
/*
public class JavaBasics {
    public static int fact(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;

        // return n * fact(n-1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }
}
*/

// Q4. Print sum of first n natural numbers. 
/*
public class JavaBasics {
    public static int sum(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn;

        // return n + sum(n-1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(sum(num));
    }
}
*/

// Q5. Print Nth fibonacci number. 
/*
public class JavaBasics {
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;

        // return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(fib(num));

        //print
        for(int i = 0; i <= num; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
*/

// Q6. Check if a given array is sorted or not using recursion.
/*
public class JavaBasics {
    public static boolean isSorted(int arr[], int i) {
        // Base Case
        if(i == arr.length - 1) {
            return true;
        }

        if(arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr, i+1);

        // return arr[i] <= arr[i+1] && isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(isSorted(arr, 0));
    }
}
*/

// Q7. Write a function the first occurence of an element in an array.
/*
public class JavaBasics {
    public static int firstOccurrence(int arr[], int key, int i) {
        // Base Case
        if(i == arr.length) {
            return -1;
        }

        if(arr[i] == key) {
            return i;
        }

        return firstOccurrence(arr, key, i+1);

        // return arr[i] == key ? i : firstOccurrence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 7, 9, 4, 6, 7, 2};
        System.out.println(firstOccurrence(arr, 7, 0));
    }
}
*/

// Q8. Write a function the last occurence of an element in an array.
/*
public class JavaBasics {
    public static int lastOccurrence(int arr[], int key, int i) {
        // Base Case
        if (i == arr.length) {
            return -1;
        }

        int idx = lastOccurrence(arr, key, i + 1);
        if (idx == -1 && arr[i] == key) {
            return i;
        }

        return idx;

        // int idx = lastOccurrence(arr, key, i + 1);
        // return idx == -1 && arr[i] == key ? i : idx;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 7, 9, 4, 7, 2};
        System.out.println(lastOccurrence(arr, 7, 0));
    }
}
*/

// Q9. Print x^n
/*
public class JavaBasics {
    public static int power(int x, int n) {
        if(n == 0) {
            return 1;
        }

        // int xnm1 = power(x, n-1);
        // int xn = x * xnm1;
        // return xn;

        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;

        System.out.println(power(x, n));
    }
}
*/

// Q10. Print x^n
// Optimized Solution 
/*
public class JavaBasics {
    public static int optimizedPower(int x, int n) {
        if(n == 0) {
            return 1;
        }

        //n is even / odd
        if(n % 2 == 0) {
            int temp = optimizedPower(x, n/2);
            return temp * temp;
        }
        else {
            int temp = optimizedPower(x, n/2);
            return x * temp * temp;
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        
        System.out.println(optimizedPower(x, n));
    }
}
*/

