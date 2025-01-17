import java.util.*;
public class Queue8 {
    //interleave two halves of a queue
    public static void interLeave(Queue<Integer> q){
        //step1: divide the queue into two halves
        Queue<Integer> q2=new ArrayDeque<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            q2.add(q.remove());
        }
        //step2: interleave two halves
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
