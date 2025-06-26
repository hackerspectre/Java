// ArrayList ✅ 
import java.util.*;

public class JavaBasics {

    public static void main(String[] args) {
        // Creating an ArrayList ✅ 
        /*
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
        */

        /*
        // Operations on ArrayList ✅ 
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Adding elements to ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Adding an element at a specific index
        list.add(2, 6);

        // Displaying ArrayList
        System.out.println(list);

        // Traversing ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Traversing ArrayList
        for (Integer i : list) {
            System.out.println(i);
        }

        // Removing elements from ArrayList
        list.remove(2);
        System.out.println(list);

        // Checking if ArrayList contains an element
        if (list.contains(3)) {
            System.out.println("3 is present in ArrayList");
        }

        // Setting an element at a specific index
        list.set(0, 10);
        System.out.println(list);

        // Getting the size of ArrayList
        System.out.println(list.size());

        // Clearing the ArrayList
        list.clear();
        System.out.println(list);
        */

        // Qs. Print reverse of an ArrayList ✅ 
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        */

        // Qs. Find maximum element in an ArrayList ✅ 
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        int max = Integer.MIN_VALUE;
        for (int i = 1; i < list.size(); i++) {
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
        */

        // Qs. Swap two elements in an ArrayList ✅ 
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Swap 2nd and 4th element
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);
        System.out.println(list);
        */

        // Sorting an ArrayList ✅ 
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Ascending order
        Collections.sort(list);
        System.out.println(list);
        
        // Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        */

        // Multi-dimensional ArrayList ✅ 
        /*
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        
        // Adding elements to ArrayList
        list.get(0).add(1);
        list.get(0).add(2);
        list.get(0).add(3);
        list.get(1).add(4);
        list.get(1).add(5);
        list.get(1).add(6);
        list.get(2).add(7);
        list.get(2).add(8);
        list.get(2).add(9);
        list.get(3).add(10);
        list.get(3).add(11);
        list.get(3).add(12);
        
        // Traversing ArrayList
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.println(list.get(i).get(j));
            }
        }
        
        // Traversing ArrayList
        for (ArrayList<Integer> i : list) {
            for (Integer j : i) {
                System.out.println(j);
            }
        }
        */

        // Multi-dimensional ArrayList ✅ 
        // list1 : 1 2 3 4 5
        // list2 : 2 4 6 8 10
        // list3 : 3 6 9 12 15
        /*
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list.add(list1);
        list.add(list2);
        list.add(list3);

        // list.get(0).add(1);
        // list.get(0).add(2);
        // list.get(0).add(3);
        // list.get(0).add(4);
        // list.get(0).add(5);

        for (int i = 1; i <= 5; i++) {
            list.get(0).add(i);
        }

        // list.get(1).add(2);
        // list.get(1).add(4);
        // list.get(1).add(6);
        // list.get(1).add(8);
        // list.get(1).add(10);

        for (int i = 2; i <= 10; i += 2) {
            list.get(1).add(i);
        }

        // list.get(2).add(3);
        // list.get(2).add(6);
        // list.get(2).add(9);
        // list.get(2).add(12);
        // list.get(2).add(15);

        for (int i = 3; i <= 15; i += 3) {
            list.get(2).add(i);
        }

        // Traversing ArrayList | 1st method
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // Traversing ArrayList | 2nd method
        for (ArrayList<Integer> i : list) {
            for (Integer j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        // Qs. Container with most water ✅ 
        // For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water
        // height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
        /*
        ArrayList<Integer> height = new ArrayList<Integer>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size() - 1; i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int area = Math.min(height.get(i), height.get(j)) * (j - i);
                max = Math.max(max, area);
            }
        }
        System.out.println(max);
        */

        // Qs. Pair Sum ✅ 
        // Find if any pair in a sorted arrayList has a target sum
        // list = [1, 2, 3, 4, 5, 6] | target = 5
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.println(list.get(i) + " " + list.get(j));
                }
            }
        }
        */

        // Qs. Triplet Sum ✅ 
        // Find if any triplet in a sorted arrayList has a target sum
        // list = [1, 2, 3, 4, 5, 6] | target = 9
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 9;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    if (list.get(i) + list.get(j) + list.get(k) == target) {
                        System.out.println(list.get(i) + " " + list.get(j) + " " + list.get(k));
                    }
                }
            }
        }
        */

        // Qs. Pair Sum ✅ | 2 pointer approach
        // Find if any pair in a sorted arrayList has a target sum
        // list = [1, 2, 3, 4, 5, 6] | target = 5
        /*
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left) + list.get(right) < target) {
                left++;
            } else if (list.get(left) + list.get(right) > target) {
                right--;
            } else {
                System.out.println(list.get(left) + " " + list.get(right));
                left++;
                right--;
            }
        }
        */
    }
}
