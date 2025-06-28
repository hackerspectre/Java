import java.util.*;

public class NewDeque {
    static class Stack {
        // Stack using Deque ✅
        Deque<Integer> deque = new LinkedList<>();

        //push
        public void push(int data) {
            deque.addLast(data);
        }

        //pop
        public int pop() {
            return deque.removeLast();
        }

        //peek
        public int peek() {
            return deque.getLast();
        }
    }

    static class Queue {
        //Queue using Deque ✅
        Deque<Integer> deque = new LinkedList<>();

        //add
        public void add(int data) {
            deque.addLast(data);
        }

        //remove
        public int remove() {
            return deque.removeFirst();
        }

        //peek
        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        /*
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        // deque.removeFirst();
        // System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        */

        /*
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek: " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        */

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Peek: " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}

