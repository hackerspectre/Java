// Binary Search Tree (Part I) ✅ 
import java.util.*;

public class JavaBasics {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Build a BTS
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            // left subtree
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            // right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Search
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    // Delete a Node
    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3
            Node temp = findInorderSuccessor(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    // minValueNode | findInorderSuccessor
    public static Node findInorderSuccessor(Node root) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // PrintInRange
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        if (root.data >= k1) {
            printInRange(root.left, k1, k2);
        }

        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data + " ");
        }

        if (root.data <= k2) {
            printInRange(root.right, k1, k2);
        }
    }

    //printArray
    public static void printArray(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " ");
        }
        System.out.println();
    }

    // Root to Leaf Paths
    public static void printPaths(Node node, ArrayList<Integer> path) {
        if (node == null) {
            return;
        }

        path.add(node.data);
        if (node.left == null && node.right == null) {
            printArray(path);
        } else {
            printPaths(node.left, path);
            printPaths(node.right, path);
        }

        path.remove(path.size() - 1);
    }

    //Validate BST
    public static boolean isValidBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }

    //Mirror a BST
    public static Node createMirror(Node node) {
        if (node == null) {
            return null;
        }
        
        Node leftMirror = createMirror(node.left);
        Node rightMirror = createMirror(node.right);

        node.left = rightMirror;
        node.right = leftMirror;

        return node;
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

    public static void main(String[] args) {
        // Build a BTS
        // int value[] = { 5, 1, 3, 4, 2, 7 };
        // int value[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        int value[] = {8, 5, 10, 3, 6, 11};
        Node root = null;

        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        inOrder(root);
        System.out.println();

        // root = delete(root, 5);
        // inOrder(root);

        // printInRange(root, 5, 12);

        // printPaths(root, new ArrayList<>());

        //Validate BST
        // System.out.println(isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        //Mirror a BST
        root = createMirror(root);
        preOrder(root);

        
        if(search(root, 6)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
    }
}
