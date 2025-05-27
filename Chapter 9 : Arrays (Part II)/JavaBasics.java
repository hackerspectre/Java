// Max Subarray Sum ✅ 
// BRUTE FORCE ✅
/* 
public class JavaBasics {
    public static void maxSubarraySum(int numbers[]) {
        int currSUm = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            int start = i;

            for(int j=i; j<numbers.length; j++) {
                int  end = j;
                currSUm = 0;

                for(int k=start; k<=end; k++) {
                    // Subarray sum
                    currSUm += numbers[k];
                }

                System.out.println(currSUm);

                if (maxSum < currSUm) {
                    maxSum = currSUm;
                }
            }
        }

        System.out.println("Max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};

        maxSubarraySum(numbers);
    }
}
*/

// PREFIX SUM ✅ 
/* 
public class JavaBasics {
    public static void maxSubarraySum(int numbers[]) {
        int currSUm = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++) {
            int start = i;

            for(int j=i; j<numbers.length; j++) {
                int  end = j;

                currSUm = start == 0 ? prefix[end] : prefix[end] - prefix[start];

                if (maxSum < currSUm) {
                    maxSum = currSUm;
                }
            }
        }

        System.out.println("Max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        
        maxSubarraySum(numbers);
    }
}
*/

// KADANE'S  ALGORITHM ✅
/* 
public class JavaBasics {
    public static void kadaneAlgorithm(int numbers[]) {
        int current_sum = numbers[0];
        int max_so_far = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            current_sum += numbers[i];
            
            if (current_sum < numbers[i])
                current_sum = numbers[i];

            if (current_sum > max_so_far)
                max_so_far = current_sum;
        }

        System.out.println("The maximum subarray sum is " + max_so_far);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3 };
        kadaneAlgorithm(numbers);
    }
}
*/

/*
public class JavaBasics {
    public static void kadaneAlgorithm(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];

            if(ms < cs) {
                ms = cs;
            }

            if(cs <  0) {
                cs = 0;
            }
        }
        
        System.out.println("The maximum subarray sum is " + ms);
    }

    public static void main(String[] args) {
        // int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3 };
        int numbers[] = {-1, -2, -3, -4};
        kadaneAlgorithm(numbers);
    }
}
*/

// Trapping Rainwater ✅ 
/* 
public class JavaBasics {
    public static int trappedRainwater(int heights[]) {
        int lmax = 0;
        int rmax = 0;
        int area = 0;
        int n = heights.length;

        for (int i = 0; i <= n - 1; i++) {
            if (heights[i] > lmax) {
                lmax = heights[i];
            } else {
                area += lmax - heights[i];
            }
        }

        lmax = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (heights[j] > rmax) {
                rmax = heights[j];
            } else {
                area += rmax - heights[j];
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("The number of units can trap is: " + trappedRainwater(height));
    }
}
*/

/* 
public class JavaBasics {
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, rightmax bound);
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water += waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println("Trapped rainwater: " + trappedRainwater(height));
    }
}
*/

/* 
public class JavaBasics {

    public static void main(String[] args) {
        int numbers[] = {40, 56, 64, 36, 82};
        int n = numbers.length;

        System.out.print("Given List : ");

        for(int i=0; i<n; i++) {
            System.out.print(" " + numbers[i]);
        }

        System.out.println();

        //shorting
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.print("Sorted list: ");

        for(int i=0; i<n; i++) {
            System.out.print(" " + numbers[i]);
        }

        System.out.println();
    }
}
*/

