// Bit Manipulation ✅ 

// Binary AND  & ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println(5 & 6); 
    }
}
*/

// Binary OR  | ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println(5 | 6);
    }
}
*/

// Binary XOR ^ ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println(5 ^ 6);
    }
}
*/

// Binary One’s Complement ~ ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println(~5); 
        System.out.println(~0);  
    }
}
*/

// Binary Left Shift <<  ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println(5 << 2);
    }
}
*/

// Binary Right Shift >>  ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        System.out.println(6 >> 1);
    }
}
*/

// Question 1 ✅ 
// Check if a number is Odd or Even ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        
        // checking using bitwise AND with 1
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            System.out.println("The given number " + num + " is even.");    
        } else {
            System.out.println("The given number " + num + " is odd.");        
        }
    }
}
*/

// Operations ✅
// Get ith bit ✅ 
/* 
public class JavaBasics {
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        // return (n & bitMask)>>>i;

        if ((n & bitMask) == 0) {
            return 0;
        }  else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));  
    }
}
*/

// Set ith bit ✅ 
/* 
public class JavaBasics {
    public static  int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(setIthBit(10, 2));
    }
}
*/

// Clear ith bit ✅ 
/* 
public class JavaBasics {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static void main(String[] args) {
        System.out.println(clearIthBit(10, 1));
    }
}
*/

// Update ith bit ✅ 
/*
public class JavaBasics {
    public static int updateIthBit(int n, int i, int newBit) {
        int bitMask = ~(1 << i);
        return (n & bitMask) | (newBit << i);
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
*/

// Clear Last i bits ✅ 
/* 
public class JavaBasics {
    public static  int clearLastBits(int n, int i) {
        int bitMask = ((~0) << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
       System.out.println(clearLastBits(15, 2)); 
    }
}
*/

// Clear Range of bits ✅ 
/* 
public class JavaBasics {
    public static  int clearRangeOfBits(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = ((1 << i) - 1);
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(10, 2, 4));
    }
}
*/

// Question 2 ✅ 
// Check if a number is a Power of 2 or not. ✅
/* 
public class JavaBasics {
    public static  boolean checkPowerofTwo(int n) {
        return  ((n & (n-1)) == 0);

        // if (n > 0 ) {
        //     return (n & (n - 1)) == 0 && n !=  1 ;
        // } else {
        //     return false;
        // }
    }

    public static void main(String[] args) {
        System.out.println(checkPowerofTwo(8)); 
        System.out.println(checkPowerofTwo(9)); 
    }
}
*/

// Question 3 ✅ 
// Count Set Bits in a Number.
/* 
public class JavaBasics {
    public static  int countSetBit(int n) {    
        int count = 0;    
          
        while (n >  0) {        
            count += n & 1;     
            n >>= 1;            
        }          
        return count;        
    }  

    public static void main(String[] args) {
        System.out.println(countSetBit(10));  
        System.out.println(countSetBit(15));  
    }
}
*/

// Fast Exponentiation ✅ 
/* 
public class JavaBasics {
    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }

        return  ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(3, 5));
        System.out.println(fastExpo(5, 3));
    }
}
*/

