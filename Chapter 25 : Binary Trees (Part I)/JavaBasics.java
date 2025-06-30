//Binary Trees (Part I) ✅ 
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1 || idx >= nodes.length) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // a. PreOrder
        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // b. InOrder
        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // c. PostOrder
        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // Level Order
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.poll();
                if (temp == null) {
                    System.out.println();
                    if (!q.isEmpty()) {
                        q.add(null);
                    }
                } else {
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                }
            }
        }

        //Height of a Tree
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        //Count of Nodes
        public static int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            return 1 + countNodes(root.left) + countNodes(root.right);
        }

        //Sum of Nodes
        public static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            return root.data + sumOfNodes(root.left) + sumOfNodes(root.right);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        tree.inOrder(root);
        tree.postOrder(root);
        tree.levelOrder(root);
        System.out.println("Height of the tree is: " + tree.height(root));
        System.out.println("Count of nodes in the tree is: " + tree.countNodes(root));
        System.out.println("Sum of nodes in the tree is: " + tree.sumOfNodes(root));
    }
}
