// QUEUE ✅ 

import java.util.*;

public class JavaBasics {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        /*
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
        }
        */

        // Queue using Array ✅
        /*
        //isEmpty
        boolean isEmpty() {
        return rear == -1;
        }
        
        //add
        boolean add(int data) {
        if (rear == size - 1) {
        System.out.println("Queue is full");
        return false;
        }
        rear++;
        arr[rear] = data;
        return true;
        }
        
        //remove
        int remove() {
        if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
        arr[i] = arr[i + 1];
        }
        rear--;
        return front;
        }
        
        //peek
        int peek() {
        if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
        }
        return arr[0];
        }
        */

        // Circular Queue using Arrays ✅
        /*
        // isEmpty
        boolean isEmpty() {
        return (front == -1 && rear == -1);
        }
        
        // isFull
        boolean isFull() {
        return ((rear + 1) % size == front);
        }
        
        // add
        boolean add(int data) {
        if (isFull()) {
        System.out.println("Queue is full");
        return false;
        }
        
        if (front == -1) {
        front = 0;
        }
        
        rear = (rear + 1) % size;
        arr[rear] = data;
        return true;
        }
        
        // remove
        int remove() {
        if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
        }
        // next
        int data = arr[front];
        if (front == rear) {
        front = rear = -1;
        } else {
        front = (front + 1) % size;
        }
        return data;
        }
        
        //peek
        int peek() {
        if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
        }
        return arr[front];
        }
        */

        // Queue using LinkedList ✅

        // isEmpty
        boolean isEmpty() {
            return head == null && tail == null;
        }

        // add
        boolean add(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            return true;
        }

        //remove
        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return data;
        }

        //peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        /*
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        */

        // Queue using LinkedList ✅
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

