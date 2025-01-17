import java.util.*;

public class Queue9 {
    //reverse a queue
    public static void reverseQue(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        reverseQue(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
