// Linked List in Java ✅ 
import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // step1 = create new node
        Node newNode = new Node(data);
        size++;
        // check if list is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step2 = newNode next = head
        newNode.next = head;
        // step3 = head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print
    public void print() {
        if (null == head) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add in the Middle
    public void addMiddle(int data, int position) {
        if (position == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count = 0;

        while (count < position - 1) {
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // removeFirst
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }

        // head = head.next;
        // size--;
    }

    // removeLast
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        }

        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    // Search(Iterative)
    public int search(int key) {
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    // Search(Recursive)
    public int searchRecursive(int key, Node node, int idx) {
        if (node == null) {
            return -1;
        }

        // next
        if (node.data == key) {
            return idx;
        }

        // next
        return searchRecursive(key, node.next, idx + 1);
    }

    // Reverse a LinkList (Iterative Approach)
    public void reverseIterative() {
        Node prev = null;
        Node current = tail = head;
        Node next = null;

        // next
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // next
        head = prev;
    }

    // Find & Remove Nth node from End (Iterative Approach)
    public void removeNthFromEnd(int n) {
        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        if (first == null) {
            head = head.next;
            return;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;
        return;
    }

    // Check if LinkList is a Palindrome
    public boolean isPalindrome() {
        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<>();

        // Push elements from first half of the linked list onto the stack
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // Skip the middle element if the list has an odd number of elements
        if (fast != null) {
            slow = slow.next;
        }

        // Compare the second half of the list with the elements in the stack
        while (slow != null) {
            int top = stack.pop();
            if (top != slow.data) {
                return false;
            }
            slow = slow.next;
        }

        return true; // Return true if all elements matched
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(2);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addMiddle(3, 2);
        ll.print();

        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // Search(Iterative)
        /*
        int searchKey = 3;
        int result = ll.search(searchKey);
        if (result == -1) {
            System.out.println("Element " + searchKey + " not found in the list.");
        } else {
            System.out.println("Element " + searchKey + " found at position: " + result);
        }
        */

        // Search(Recursive)
        /*
        int searchKey = 3;
        int result = ll.searchRecursive(searchKey, ll.head, 0);
        if (result == -1) {
            System.out.println("Element " + searchKey + " not found in the list.");
        } else {
            System.out.println("Element " + searchKey + " found at position: " + result);
        }
        */

        // Reverse a LinkList (Iterative Approach)
        // reverseIterative
        /*
        ll.reverseIterative();
        ll.print();
        */

        // Find & Remove Nth node from End (Iterative Approach)
        /*
        int n = 3;
        ll.removeNthFromEnd(n);
        ll.print();
        */

        // Check if LinkList is a Palindrome
        /*
        boolean isPalindrome = ll.isPalindrome();
        if (isPalindrome) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
        */
    }
}
