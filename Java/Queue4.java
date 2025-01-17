import java.util.*;
public class Queue4 {
    //implementing queue using JCF
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();//since, Queue is an interface in java so we cannot make an obj out of interface, so Queues are implemented using LinkedList or ArrayDeque class 
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
