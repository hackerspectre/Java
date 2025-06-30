// Binary Trees (Part III) ✅ 
import java.util.*;

public class JavaBasics {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left_height = height(root.left);
        int right_height = height(root.right);
        return Math.max(left_height, right_height) + 1;
    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    // Kth Level of a Tree
    public static void kthLevel(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 1) {
            System.out.print(root.data + " ");
        } else {
            kthLevel(root.left, k - 1);
            kthLevel(root.right, k - 1);
        }
    }

    //Lowest Common Ancestor
    public static Node LCA(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node left_lca = LCA(root.left, n1, n2);
        Node right_lca = LCA(root.right, n1, n2);

        if (left_lca != null && right_lca != null) {
            return root;
        }

        return (left_lca != null) ? left_lca : right_lca;
    }

    //Min Distance between nodes
    public static int findDistance(Node root, int n1, int n2) {
        Node lca = LCA(root, n1, n2);
        int d1 = findLevel(root, n1, 1);
        int d2 = findLevel(root, n2, 1);
        return d1 + d2 - 2 * findLevel(root, lca.data, 1);
    }

    //findLevel
    public static int findLevel(Node root, int k, int level) {
        if (root == null) {
            return -1;
        }

        if (root.data == k) {
            return level;
        }

        int left = findLevel(root.left, k, level + 1);
        if (left != -1) {
            return left;
        }

        return findLevel(root.right, k, level + 1);
    }

    //Kth Ancestor of Node
    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int left = kthAncestor(root.left, n, k);
        int right = kthAncestor(root.right, n, k);

        if (left == -1 && right == -1) {
            return -1;
        }

        int max = Math.max(left, right);
        if (max+1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    //Transform to Sum Tree
    public static Node transformToSumTree(Node root) {
        if (root == null) {
            return null;
        }
        //next
        int sum = sum(root);
        root.data = sum;
        root.left = transformToSumTree(root.left);
        root.right = transformToSumTree(root.right);
        return root;
    }

    //printInorder
    public static void printInorder(Node root) {
        if (root == null) {
            return;
        }
        //next
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        /*
              1
             / \
            2   3
           / \ / \
          4  5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // int k = 3;
        // kthLevel(root, k);

        // int n1 = 4;
        // int n2 = 6;
        // Node lca = LCA(root, n1, n2);
        // System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);

        // int n1 = 4;
        // int n2 = 6;
        // System.out.println("Distance between " + n1 + " and " + n2 + " is: " + findDistance(root, n1, n2));

        // int n = 5;
        // int k = 2;
        // kthAncestor(root, n, k);

        //Transform to Sum Tree
        root = transformToSumTree(root);
        printInorder(root);
    }
}
