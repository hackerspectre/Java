// What are String? ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println("The letter " + str.charAt(i) + " is in the position: " + i);
        }
    }

    public static void main(String[] args) {
        char arr [] = {'a', 'b', 'c', 'd'};
        String str1 = "abcd";
        String str2 = new String("xyz");

        // String are IMMUTABLE

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = sc.next();
        // System.out.println("Hello, " + name + "!");

        // System.out.print("Enter your full name: ");
        // String name = sc.next();
        // String name = sc.nextLine();
        // System.out.println("Hello, " + name + "!"); 

        // String fullName = "Hacker Bikram";
        // System.out.println(fullName.length());   // Length of the string

        //Concatenation 
        String firstName = "Hacker";
        String lastName = "Bikram";
        String  fullName = firstName + " " + lastName;

        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));     // Returns character at given index in the string
        printLetters(fullName);
    }
}
*/

// Question - 1 ✅ 
// Check if a String is a Palindrome ✅ 
/* 
public class JavaBasics {
    public static boolean isPalindrome(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }   
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
*/

// Question 2 ✅ 
// Given a route containing 4 directions (E, W, N, S), 
// find the shortest path to reach destination. 
/* 
public class JavaBasics {
    public static float getShortesPath(String path) {
        int x = 0, y = 0;

        for(int i=0;  i < path.length(); i++) {
            char dir = path.charAt(i);
            //south
            if(dir == 'S') {
                y++;
            } 
            // north
            else if(dir == 'N') {
                y--;
            }  
            // west
            else if(dir == 'W') {
                x--;
            }   
            // east
            else if(dir=='E'){
                x++;
            }
        }
        
        // int X2 = x*x;
        // int Y2 = y*y;
        // return (float)Math.sqrt(X2 + Y2);
        
        return (float)Math.sqrt(x*x + y*y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println("The shortest path is : " + getShortesPath(path));
    }
}
*/

// String Functions - Compare ✅ 
/* 
import java.util.*;
public class JavaBasics {

    public static void main(String[] args) {
        String str1 = "Bikram";
        String str2 = "Bikram";
        String str3 = new String("Bikram");

        if (str1 == str2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // if (str1 == str3) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        if (str1.equals(str3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
*/

// String Functions - Substring ✅ 
/*
public class JavaBasics {
    public static String substring(String str, int startIndex, int endIndex) {
        String subStr = "";
       for(int i=startIndex; i<endIndex; i++) {
        subStr += str.charAt(i);
       }
       return subStr;
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Original string: " + str);
        
        System.out.println("Substring from index 0 to 4: ");
        System.out.println(substring(str, 0, 5));   // Output: Hello

        System.out.println("Substring from index 6 to 11: ");
        System.out.println(substring(str, 6, 12));   // Output: World!

        // Inbuilt substring()
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(6, 11));
    }
}
*/

// Print Largest String ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largestFruit = fruits[0];

        for(int i=1; i < fruits.length; i++){
           if (fruits[i].compareTo(largestFruit) > 0){
               largestFruit = fruits[i];
           }
        }
        System.out.println("The largest fruit is: " + largestFruit);
    }
}
*/

// StringBuilder ✅ 
/*
public class JavaBasics {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        
        for(char ch='a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println("Using append(): " + sb);

        int len = sb.length();
        System.out.println("Length using length(): " + len);

        char c = sb.charAt(5);
        System.out.println("Character at index 5 using charAt(): " + c);
    }
}
*/

// Convert Letters to Uppercase ✅ 
/*
public class JavaBasics {

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Original string: " + str);

        // Using toUpperCase() method
        String upperStr1 = str.toUpperCase();
        System.out.println("Converted to uppercase using toUpperCase(): " + upperStr1);

        // Using Character.toUpperCase() method in a loop
        String upperStr2 = "";
        for (int i=0; i<str.length(); i++) {
            upperStr2 += Character.toUpperCase(str.charAt(i));
        }
        System.out.println("Converted to uppercase using Character.toUpperCase(): " + upperStr2);

        // Using StringBuilder in a loop
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        System.out.println("Converted to uppercase using StringBuilder: " + sb);

        // LowerCase() method
        String lowerStr = str.toLowerCase();
        System.out.println("Converted to lowercase using toLowerCase(): " + lowerStr);
    }
}
*/

// Question 4 ✅ 
// For a given String convert each the first letter of each word to uppercase. 
/* 
import java.util.*;
public class JavaBasics {
    public static String toUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean nextToUpper = true;

        for (char c : str.toCharArray()) {
            if (nextToUpper) {
                result.append(Character.toUpperCase(c));
                nextToUpper = false;
            } else {
                result.append(c);
            }

            if (' ' == c) {
                nextToUpper = true;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = " hi, i am HACKER!";
        System.out.println(toUpperCase(str));
    }
}
*/

// Question 5 ✅ 
// String Compression ✅ 
/*
public class JavaBasics {
    public static  String compressString(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } 
        
        int count = 1;
        char prev = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        
        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i) != prev) {
                sb.append(prev).append(count);
                count = 1;
                prev = str.charAt(i);
            } else {
                count++;
            }
        }
        sb.append(prev).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println("Input string: " + str);
        System.out.println("Compressed string: " + compressString(str));
    }
}
*/

/*
public class JavaBasics {
    public static String toUpperCase(String str) {
        // Convert each the first letter of each word to uppercase
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String str = "hi, i am HACKER!";
        System.out.println(toUpperCase(str));
    }
}
*/

/*
public class JavaBasics {
    public static String toUpperCase(String str) {
        // convert each the first letter of each word to uppercase
        StringBuilder sb = new StringBuilder();
        for (String word : str.split(" ")) {
            sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "hi, i am HACKER!";
        System.out.println(toUpperCase(str));
    }
}
*/

