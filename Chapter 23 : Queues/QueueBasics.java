import java.util.*;

public class QueueBasics {
    //Stack using 2 Queues
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        //isEmpty
        public static boolean isEmpty(){
            return q1.isEmpty();
        }

        //add
        public static void push(int data){
            q2.add(data);
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        //remove
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            return q1.poll();
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return q1.peek();
        }
    }

    //Queue using 2 stack
    /*
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //isEmpty
        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public static void add(int data){
            s1.push(data);
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            //shift element from s1 to s2
            while(s1.size()>1){
                s2.push(s1.pop());
            }
            int top = s1.pop();
            //shift back from s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            //shift element from s1 to s2
            while(s1.size()>1){
                s2.push(s1.pop());
            }
            int top = s1.peek();
            //shift back from s2 to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            return top;
        }
    }
    */

    public static void main(String[] args) {
        /*
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);

        // System.out.println(q.peek()); // prints 1
        while(!q.isEmpty()) {
            System.out.println(q.peek()); // prints 1, 2, 3
            q.remove();
        }
        */

        /*
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()) {
            System.out.println(q.peek()); // prints 1, 2, 3
            q.remove();
        }
        */

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()) {
            System.out.println(s.peek()); // prints 3, 2, 1
            s.pop();
        }
    }
}
