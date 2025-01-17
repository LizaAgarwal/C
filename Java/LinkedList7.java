import java.util.LinkedList;//java collections framework
public class LinkedList7 {
    public static void main(String[] args) {
        //create a ll
        LinkedList<Integer> ll=new LinkedList<>();
        //add data
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(4);
        //remove data
        ll.removeFirst();
        ll.removeLast();
        //print ll
        System.out.println(ll);
    }
}
