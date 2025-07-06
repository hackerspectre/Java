// HashMap ✅ 
import java.util.*;
import java.util.HashMap;
import java.util.Set;

public class JavaBasics {

    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        //add | put
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);
        hm.put("Japan", 200);
        hm.put("Germany", 250);
        // System.out.println("HashMap: " + hm);

        /*
        //get
        int population = hm.get("India");
        System.out.println("Population of India: " + population);

        System.out.println(hm.get("Indonesia"));

        //ContainsKey 
        boolean isKeyPresent = hm.containsKey("US");
        System.out.println("Is US present in HashMap? " + isKeyPresent);
        System.out.println(hm.containsKey("Indonesia"));

        //remove
        hm.remove("China");
        System.out.println("HashMap after removing China: " + hm);

        //size
        int size = hm.size();
        System.out.println("Size of HashMap: " + size);

        //IsEmpty
        boolean isEmpty = hm.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);

        //clear
        hm.clear();
        System.out.println("HashMap after clearing: " + hm);
        */

        //Iterate
        // hm.entrySet(); 
        Set<String> keys = hm.keySet();
        // System.out.println(keys);
        for (String k : keys) {
            System.out.println("Key: " + k + ", Value: " + hm.get(k));
        }


        // Qs. Largest subarray with sum 0?
        /*
        int[] arr = { 1, 2, 3, -2, 5 };
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            } else {
                if (map.containsKey(sum)) {
                    maxLen = Math.max(maxLen, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        System.out.println(maxLen);
        */

        // Qs. Subarray sun equal to K?
        int[] arr = { 1, 2, 3, -2, 5 };
        int k = 3;
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                count++;
            }
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}

