// Binary Trees (Part II) ✅ 
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

    // Diameter of a Tree
    static int diameter(Node tree) {
    if (tree == null) {
    return 0;
    }
    int lheight = height(tree.left);
    int rheight = height(tree.right);
    
    int ldiameter = diameter(tree.left);
    int rdiameter = diameter(tree.right);
    
    return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
    }
    
    /*
    static class Info {
        int height;
        int diameter;

        public Info(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static Info diameter(Node root) {
        if (root == null) {
            return new Info(0, 0);
        }
        // next
        Info left = diameter(root.left);
        Info right = diameter(root.right);
        // next
        int height = Math.max(left.height, right.height) + 1;
        int diameter = Math.max(left.height + right.height + 1, Math.max(left.diameter, right.diameter));
        return new Info(height, diameter);
    }
    */

    // Subtree of another Tree
    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }
        
        if(!isIdentical(root.left, subRoot.left)) {
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot.right);
    }

    //Top view of a Tree
    public static void topView(Node root, int hd, Map<Integer, Integer> map) {
        if (root == null) {
            return;
        }
        if (!map.containsKey(hd)) {
            map.put(hd, root.data);
        }
        topView(root.left, hd - 1, map);
        topView(root.right, hd + 1, map);
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

        //topView
        Map<Integer, Integer> map = new HashMap<>();
        topView(root, 0, map);
        //print
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }

        // System.out.println(diameter(root));
        // Info info = diameter(root);
        // System.out.println("Height: " + info.height);
        // System.out.println("Diameter: " + info.diameter);

        /*
         2
        / \
        4 5
        */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        // System.out.println(isSubtree(root, subRoot));
    }
}
