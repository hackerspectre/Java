// Binary Search Trees (Part II) ✅ 
import java.util.*;

public class JavaBasics {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    //Sorted array to Balanced BST
    public static Node createBST(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr, st, mid - 1);
        root.right = createBST(arr, mid + 1, end);
        return root;
    }

    //PreOrder
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Convert BST to Balanced BST
    public static Node BSTtoBalancedBST(Node root) {
        if (root == null) {
            return null;
        }

        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        int arr[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return createBST(arr, 0, arr.length - 1);
    }

    //inOrder
    public static void inOrder(Node root, List<Integer> list) {
        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
    }

    public static void main(String[] args) {
        // int arr[] = {3, 5, 6, 8, 10, 11, 12};
        // Node root = createBST(arr, 0, arr.length - 1);
        // preOrder(root);

        //Convert BST to Balanced BST
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        root = BSTtoBalancedBST(root);
        preOrder(root);
    }
}

