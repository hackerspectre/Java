// Arrays ✅ 
// Creating an Array ✅ 
/* 
public class JavaBasics {

    public static void main(String[] args) {
        // Creating an array 

        int marks[] = new int[50];

        int numbers[] = {1, 2, 3};

        int moreNumbers[] = {4, 5, 6};

        String fruits[] = {"apple", "mango", "orange"};
    }
}
*/

// Input / Output ✅ 
/* 
import java.util.Scanner;

public class JavaBasics {

    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Phy Mark: ");
        // int phy = sc.nextInt();

        // System.out.print("Enter Chem Mark: ");
        // int chem = sc.nextInt();

        // System.out.print("Enter Math Mark: ");
        // int math = sc.nextInt();

        System.out.println(" length of array = " + marks.length);

        // System.out.print("Enter Phy Mark: ");
        // marks[0] = sc.nextInt();

        // System.out.print("Enter Chem Mark: ");
        // marks[1] = sc.nextInt();

        // System.out.print("Enter Math Mark: ");
        // marks[2] = sc.nextInt(); 

        // System.out.println("Phy: " + marks[0]);
        // System.out.println("Chem: " + marks[1]);
        // System.out.println("Math: " + marks[2]);

        // marks[2] = marks[2] + 1;
        // System.out.println("Math: " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage: " + percentage + "%");
    }
}
*/

// Passing arrays as argument ✅ 
/* 
public class JavaBasics {
    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);

        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
*/

// Linear Search ✅ 
/* 
public class JavaBasics {
    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 10; 

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("NOT Found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
*/

/*
public class JavaBasics {
    public static String linearSearch(String menu[], String choice) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == choice) {
                return menu[i];
            }
        }

        return "NOT Found";
    }

    public static void main(String[] args) {
        String menu[] = {"Tea", "Coffee", "Milk", "Juice", "Water"};
        String choice = "Coffee";

        String result = linearSearch(menu, choice);
        
        if (result == "NOT Found") {
            System.out.println("NOT Found");
        } else {
            System.out.println("Choice is: " + result);
        }
    }
}
*/

// Largest Number ✅ 
/* 
public class JavaBasics {
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;    // -infinity

        for(int i=0; i<numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};

        System.out.println("largest value is: " + getLargest(numbers));
    }
}
*/

// Smallest Number ✅ 
/*
public class JavaBasics {
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;   // +infinity

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        return smallest;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 6, 3, 5};

        System.out.println("smallest value is: " + getSmallest(numbers));
    }
}
*/

// Binary Search ✅ 
/* 
public class JavaBasics {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("Index for key is: " + binarySearch(numbers, key));
    }
}
*/

// Reverse an Array ✅ 
/* 
public class JavaBasics {
    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length-1;

        while (first < last) {
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);
        
        // Print
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }
}
*/

// Pairs in an Array ✅ 
/* 
public class JavaBasics {
    public static void printPairs(int numbers[]) {
        int tp = 0;

        for (int i=0; i<numbers.length; i++) {
            int curr = numbers[i];

            for(int j=i+1; j<numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }

            System.out.println();
        }

        System.out.println("Total pairs: " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        printPairs(numbers);
    }
}
*/

// Print Subarrays ✅ 
/* 
public class JavaBasics {
    public static void printSubarrays(int numbers[]) {
        int ts = 0;

        for(int i=0; i<numbers.length; i++) {
            int start = i;

            for(int j=i; j<numbers.length; j++) {
                int end = j;

                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                }

                ts++;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Total Subarrays: " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        printSubarrays(numbers);
    }
}
*/

// Print Subarrays with Sum ✅
/*
public class JavaBasics {

    // Method to print all subarrays and their sums
    public static void printSubarrays(int numbers[]) {
        int ts = 0; // Total subarrays count

        for(int i=0; i<numbers.length; i++) {
            int start = i;

            for(int j=i; j<numbers.length; j++) {
                int end = j;

                for(int k=start; k<=end; k++) {
                    System.out.print(numbers[k] + " ");
                }

                // Print the sum of the subarray
                System.out.println("Sum: " + sumSubarray(numbers, start, end));
                
                ts++;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Total Subarrays: " + ts);
    }

    // Method to calculate the sum of a subarray from index start to end
    public static int sumSubarray(int numbers[], int start, int end) {
        int sum = 0;
        for(int i=start; i<=end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // Maximum Subarray Sum ✅
    public static int maxSubarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<numbers.length; i++) {
            currSum += numbers[i];

            if (currSum > maxSum) {
                maxSum = currSum;
            }

            if (currSum < 0) {
                currSum = 0;
            }
        }

        return maxSum;
    }

    // Minimum Subarray Sum ✅
    public static int minSubarraySum(int numbers[]) {
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;

        for(int i=0; i<numbers.length; i++) {
            currSum += numbers[i];

            if (currSum < minSum) {
                minSum = currSum;
            }

            if (currSum > 0) {
                currSum = 0;
            }
        }

        return minSum;
    }

    // Main method to test the printSubarrays method
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);

        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(numbers));
        System.out.println("Minimum Subarray Sum: " + minSubarraySum(numbers));
    }
}
*/

