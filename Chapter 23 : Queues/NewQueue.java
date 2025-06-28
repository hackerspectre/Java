import java.util.LinkedList;
import java.util.Queue;

public class NewQueue {
    //Q. First Non-repeating Letter in a Stream of characters 
    /*
    static char firstNonRepeatingCharacter(String str){
        int count[] = new int[256];

        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }

        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i)] == 1){
                return str.charAt(i);
            }
        }

        return '$';
    }
    */

    //Q. Interleave 2 Halves of a Queue (even length)
    /*
    static void interleave(Queue<Integer> q){
        int n = q.size();
        Queue<Integer> temp = new LinkedList<>();

        for(int i=0; i<n/2; i++){
            temp.add(q.poll());
        }

        while(!q.isEmpty()){
            temp.add(q.poll());
            temp.add(temp.poll());
        }

        while(!temp.isEmpty()){
            q.add(temp.poll());
        }

        while(!q.isEmpty()){
            System.out.print(q.poll() + " ");
        }
    }
    */

    //Q. Queue Reversal
    static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }

        //next
        int x = q.remove();
        reverse(q);
        q.add(x);
    }
    
    public static void main(String[] args) {
        /*
        String str = "aabccxb";
        System.out.println(firstNonRepeatingCharacter(str));
        */

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        reverse(q);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
