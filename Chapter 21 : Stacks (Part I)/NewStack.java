import java.util.*;

public class NewStack {
    //Push at the bottom of the Stack ✅
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    //Reverse a String using a Stack ✅
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            s.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        return sb.toString();
    }

    //Reverse a Stack ✅
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int temp = s.pop();
        reverseStack(s);
        pushAtBottom(s, temp);
    }

    //Stock Span Problem ✅
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;
        for (int i = 1; i < stocks.length; i++) {
            while (!s.isEmpty() && stocks[s.peek()] <= stocks[i]) {
                s.pop();
            }
            span[i] = s.isEmpty() ? i + 1 : i - s.peek();
            s.push(i);
        }
    }

    //Next Greater Element ✅ 
    //The next greater element of some element X in an array is the first greater element that is to the right of X in the same array.
    public static void nextGreaterElement(int arr[]) {
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() < arr[i]) {
                System.out.println(s.pop() + " --> " + arr[i]);
            }
            s.push(arr[i]);
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop() + " --> -1");
        }
    }

    public static void main(String[] args) {
        /*
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        */

        /*
        String str = "abc";
        System.out.println(reverseString(str));
        */

        /*
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        */

        /*
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];

        stockSpan(stocks, span);

        for(int i=0; i<span.length; i++) {
            System.out.print(span[i] + " ");
        }
        System.out.println();
        */

        /*
        int arr[] = {6, 8, 0, 1, 3};
        nextGreaterElement(arr);
        */
    }
}
