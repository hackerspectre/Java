// Devide and Conquer ✅ 
// Merge Sort ✅ 
// Time Complexity: O(n log n)
// Space Complexity: O(n)
/*
public class JavaBasics {
    public static void mergeSort(int arr[], int si, int ei) {
        //base case
        if (si >= ei) {
            return;
        }

        if (si < ei) {
            int mid = si + (ei - si) / 2;
            mergeSort(arr, si, mid);
            mergeSort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        }
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int n1 = mid - si + 1;
        int n2 = ei - mid;

        // next
        int L[] = new int[n1];
        int R[] = new int[n2];

        // next
        for (int i = 0; i < n1; i++) {
            L[i] = arr[si + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        // next
        int i = 0, j = 0, k = si;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 1, 3, 5, 2 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
*/

// Quick Sort ✅ 
/*
public class JavaBasics {
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    //partition
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        //next
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //next
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        //next
        return i + 1;
    }

    //print
    public static void printArray(int arr[]) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 1, 3, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
*/

// Sorted Rotated Array Search ✅ 
/*
public class JavaBasics {
    public static int search(int arr[], int t, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }

        // next
        int mid = si + (ei - si) / 2;

        // next
        if (arr[mid] == t) {
            return mid;
        }

        // next
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= t && t < arr[mid]) {
                return search(arr, t, si, mid - 1);
            } else {
                return search(arr, t, mid + 1, ei);
            }
        } else {
            if (arr[mid] < t && t <= arr[ei]) {
                return search(arr, t, mid + 1, ei);
            } else {
                return search(arr, t, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int result = search(arr, target, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
*/

