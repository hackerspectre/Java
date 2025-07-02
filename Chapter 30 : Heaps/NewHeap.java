// Heap ✅ 
import java.util.*;

public class NewHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        //Insert in Heap
        public void add(int data) {
            arr.add(data);
            int index = arr.size() - 1;
            int parent = (index - 1) / 2;
            while (arr.get(index) < arr.get(parent)) {
                //swap
                int temp = arr.get(index);
                arr.set(index, arr.get(parent));
                arr.set(parent, temp);
            }
        }

        //Peek from Heap
        public int peek() {
            return arr.get(0);
        }

        //Remove from Heap
        public int remove() {
            int data = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.remove(arr.size() - 1);
            int index = 0;
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            while (left < arr.size()) {
                int minIndex = index;
                if (arr.get(minIndex) > arr.get(left)) {
                    minIndex = left;
                }
                if (right < arr.size() && arr.get(minIndex) > arr.get(right)) {
                    minIndex = right;
                }
                if (minIndex == index) {
                    break;
                }
                int temp = arr.get(minIndex);
                arr.set(minIndex, arr.get(index));
                arr.set(index, temp);
                index = minIndex;
                left = 2 * index + 1;
                right = 2 * index + 2;
            }
            return data;
        }

        // Size of Heap
        public int size() {
            return arr.size();
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    
    public static void main(String[] args) {
        // Creating a priority queue
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(7);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

        // Heap Sorting
        int[] arr = { 3, 4, 1, 7 };
        Heap h1 = new Heap();
        for (int i = 0; i < arr.length; i++) {
            h1.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = h1.remove();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
